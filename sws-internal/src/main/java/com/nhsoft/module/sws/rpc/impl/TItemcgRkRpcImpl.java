package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.BranchDTO;
import com.nhsoft.module.base.export.dto.OrderQueryCondition;
import com.nhsoft.module.base.export.rpc.BranchRpc;
import com.nhsoft.module.inventory.export.dto.ReceiveOrderDetailDTO;
import com.nhsoft.module.origin.export.AppConstants;
import com.nhsoft.module.origin.export.State;
import com.nhsoft.module.sws.export.model.TItemcgRk;
import com.nhsoft.module.sws.export.rpc.TItemcgRkRpc;
import com.nhsoft.module.sws.service.TItemcgRkService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import com.nhsoft.module.transfer.export.dto.ReceiveOrderDTO;
import com.nhsoft.module.transfer.export.rpc.ReceiveOrderRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class TItemcgRkRpcImpl implements TItemcgRkRpc {

    @Autowired
    private TItemcgRkService tItemcgRkService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSaveItemcgRk(List<TItemcgRk> tItemcgRks) {
        tItemcgRkService.batchSaveItemcgRk(tItemcgRks);
    }

    @Override
    public List<TItemcgRk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo) {

        String url = nhhosUtil.getUrl(systemBookCode);
        ReceiveOrderRpc receiveOrderRpc = nhhosUtil.createCenterObject(ReceiveOrderRpc.class, url);

        BranchRpc branchRpc = nhhosUtil.createCenterObject(BranchRpc.class, url);
        List<BranchDTO> brnachs = branchRpc.findAll(systemBookCode);
        List<Integer> branchNums = new ArrayList<>();
        for (int i = 0,len = brnachs.size(); i < len ; i++) {
            BranchDTO branchDTO = brnachs.get(i);
            branchNums.add(branchDTO.getBranchNum());
        }


        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            dateFrom = sdf.parse("2018-01-01 00:00:00");

            dateTo = sdf.parse("2018-02-27 23:59:59");
        } catch (ParseException e) {
            e.printStackTrace();
        }*/


        OrderQueryCondition query = new OrderQueryCondition();
        query.setToBranchNums(branchNums);
        query.setDateStart(dateFrom);
        query.setDateEnd(dateTo);
        query.setDateType(AppConstants.STATE_AUDIT_TIME);
        State state = new State();
        state.setStateCode(AppConstants.STATE_AUDIT_CODE);
        query.setState(state);

        List<ReceiveOrderDTO> receiveOrderDTOS = receiveOrderRpc.findOrderByTime(systemBookCode, query);
        int size = receiveOrderDTOS.size();
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        List<TItemcgRk> list = new ArrayList<>(size);
        for (int i = 0; i <size ; i++) {

            ReceiveOrderDTO dto = receiveOrderDTOS.get(i);
            TItemcgRk itemcgRk = new TItemcgRk();
            itemcgRk.setLngActivityId(dto.getReceiveOrderFid());//长度太长   Data truncation
            itemcgRk.setLngReceiptNo(dto.getReceiveOrderBillNo() == null ? dto.getReceiveOrderFid() : dto.getReceiveOrderBillNo());

            itemcgRk.setIntDirection("0");////审批及作废标志       审批-0
            itemcgRk.setStrplaymethod("??");//支付方式
            itemcgRk.setStrcustomercode(dto.getSupplier().getSupplierCode());

            itemcgRk.setDblQuantity(new BigDecimal(111));//数量
            itemcgRk.setDblPurchasePrice(dto.getReceiveOrderTotalMoney());
            itemcgRk.setStremployeecode(dto.getReceiveOrderOperator());
            itemcgRk.setStrdepartmentcode(String.valueOf(dto.getBranchNum()));//部门名称
            itemcgRk.setStrPositionName(String.valueOf(dto.getStorehouseNum()));////货位名称
            itemcgRk.setBytStatus("0");     //  0-未处理  1-已处理
            itemcgRk.setStrDate(time);
            itemcgRk.setIsnotposition(String.valueOf(dto.getStorehouseNum()));//货位是否存在
            itemcgRk.setStrorgcode(systemBookCode);

            List<ReceiveOrderDetailDTO> details = dto.getReceiveOrderDetails();
            for (int j = 0,len = details.size(); j < len ; j++) {
                ReceiveOrderDetailDTO detailDTO = details.get(j);
                itemcgRk.setLngxhActivityId(String.valueOf(detailDTO.getReceiveOrderDetailNum()));////序号
                itemcgRk.setLngTollMaterialD(String.valueOf(detailDTO.getItemNum()));
                itemcgRk.setStrTollMaterialName(detailDTO.getReceiveOrderDetailItemName());
                itemcgRk.setStrTollMaterialStyle(detailDTO.getReceiveOrderDetailItemSpec());
                itemcgRk.setStrUnitName(detailDTO.getReceiveOrderDetailItemUnit());//计量单位
                list.add(itemcgRk);
            }

        }
        return list;
    }
}
