package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.AdjustmentOrderDTO;
import com.nhsoft.module.base.export.dto.AdjustmentOrderDetailDTO;
import com.nhsoft.module.base.export.dto.BranchDTO;
import com.nhsoft.module.base.export.dto.OrderQueryCondition;
import com.nhsoft.module.base.export.rpc.BranchRpc;
import com.nhsoft.module.inventory.export.rpc.AdjustmentOrderRpc;
import com.nhsoft.module.origin.export.AppConstants;
import com.nhsoft.module.sws.export.model.TItemotherRk;
import com.nhsoft.module.sws.export.rpc.TItemotherRkRpc;
import com.nhsoft.module.sws.service.TItemotherRkService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.TaskNamespaceHandler;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class TItemotherRkRpcImpl implements TItemotherRkRpc {

    @Autowired
    private TItemotherRkService tItemotherRkService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSaveItemotherRk(List<TItemotherRk> itemotherRks) {
        tItemotherRkService.batchSaveItemotherRk(itemotherRks);
    }

    @Override
    public List<TItemotherRk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo) {

        String url = nhhosUtil.getUrl(systemBookCode);
        AdjustmentOrderRpc adjustmentOrderRpc = nhhosUtil.createCenterObject(AdjustmentOrderRpc.class, url);

        BranchRpc branchRpc = nhhosUtil.createCenterObject(BranchRpc.class, url);
        List<BranchDTO> brnachs = branchRpc.findAll(systemBookCode);
        List<Integer> branchNums = new ArrayList<>();
        for (int i = 0,len = brnachs.size(); i < len ; i++) {
            BranchDTO branchDTO = brnachs.get(i);
            branchNums.add(branchDTO.getBranchNum());
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            dateFrom = sdf.parse("2017-01-01 00:00:00");

            dateTo = sdf.parse("2018-02-27 23:59:59");
        } catch (ParseException e) {
            e.printStackTrace();
        }



        OrderQueryCondition query = new OrderQueryCondition();
        query.setToBranchNums(branchNums);
        query.setDateType(AppConstants.STATE_AUDIT_TIME);//审核时间
        query.setDateStart(dateFrom);
        query.setDateEnd(dateTo);

        List<AdjustmentOrderDTO> adjustmentOrderDTOS = adjustmentOrderRpc.findOrderByTime(systemBookCode, query, AppConstants.ADJUSTMENT_DIRECTION_IN);
        int size = adjustmentOrderDTOS.size();
        List<TItemotherRk> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        for (int i = 0; i < size ; i++) {

            AdjustmentOrderDTO adjustmentOrderDTO = adjustmentOrderDTOS.get(i);
            TItemotherRk itemotherRk = new TItemotherRk();
            itemotherRk.setLngActivityId(adjustmentOrderDTO.getAdjustmentOrderFid());
            itemotherRk.setLngReceiptNo(adjustmentOrderDTO.getAdjustmentOrderFid());
            itemotherRk.setIntDirection("0");
            itemotherRk.setStrcustomercode("????");// 采购单位  供应商编码
            itemotherRk.setStremployeecode(adjustmentOrderDTO.getAdjustmentOrderCreator());
            itemotherRk.setStrdepartmentcode(String.valueOf(adjustmentOrderDTO.getBranchNum()));
            itemotherRk.setStrPositionName(String.valueOf(adjustmentOrderDTO.getStorehouseNum()));
            itemotherRk.setBytStatus("0");
            itemotherRk.setStrDate(time);
            itemotherRk.setStrorgcode(systemBookCode);

            List<AdjustmentOrderDetailDTO> details = adjustmentOrderDTO.getAdjustmentOrderDetails();
            for (int j = 0,len = details.size(); j < len; j++) {
                AdjustmentOrderDetailDTO detail = details.get(i);
                itemotherRk.setLngxhActivityId(String.valueOf(detail.getAdjustmentOrderDetailNum()));
                itemotherRk.setLngTollMaterialD(String.valueOf(detail.getItemNum()));
                itemotherRk.setStrTollMaterialName(detail.getAdjustmentOrderDetailItemName());
                itemotherRk.setStrTollMaterialStyle(detail.getAdjustmentOrderDetailItemSpec());
                itemotherRk.setStrUnitName(detail.getAdjustmentOrderDetailItemUnit());
                itemotherRk.setDblQuantity(detail.getAdjustmentOrderDetailQty());
                itemotherRk.setDblPurchasePrice(detail.getAdjustmentOrderDetailPrice());
                itemotherRk.setDblamount(detail.getAdjustmentOrderDetailPrice());
                /**   ????单价和金额 有什么区别
                 * private BigDecimal dblPurchasePrice;           //单价
                   private BigDecimal dblamount;                  //金额
                 * */
                list.add(itemotherRk);
            }

        }
        return list;
    }
}
