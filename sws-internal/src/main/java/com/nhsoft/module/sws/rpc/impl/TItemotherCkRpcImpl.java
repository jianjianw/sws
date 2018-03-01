package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.AdjustmentOrderDTO;
import com.nhsoft.module.base.export.dto.AdjustmentOrderDetailDTO;
import com.nhsoft.module.base.export.dto.BranchDTO;
import com.nhsoft.module.base.export.dto.OrderQueryCondition;
import com.nhsoft.module.base.export.rpc.BranchRpc;
import com.nhsoft.module.inventory.export.rpc.AdjustmentOrderRpc;
import com.nhsoft.module.origin.export.AppConstants;
import com.nhsoft.module.sws.export.model.TItemotherCk;
import com.nhsoft.module.sws.export.model.TItemotherRk;
import com.nhsoft.module.sws.export.model.TItempkCk;
import com.nhsoft.module.sws.export.rpc.TItemotherCkRpc;
import com.nhsoft.module.sws.service.TItemotherCkService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class TItemotherCkRpcImpl implements TItemotherCkRpc {

    @Autowired
    private TItemotherCkService tItemotherCkService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSaveItemotherCk(List<TItemotherCk> itemotherCks) {
        tItemotherCkService.batchSaveItemotherCk(itemotherCks);
    }

    @Override
    public List<TItemotherCk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo) {
        String url = nhhosUtil.getUrl(systemBookCode);
        AdjustmentOrderRpc adjustmentOrderRpc = nhhosUtil.createCenterObject(AdjustmentOrderRpc.class, url);
        BranchRpc branchRpc = nhhosUtil.createCenterObject(BranchRpc.class, url);
        List<BranchDTO> brnachs = branchRpc.findAll(systemBookCode);


        List<Integer> branchNums = new ArrayList<>();
        for (int i = 0,len = brnachs.size(); i < len ; i++) {
            BranchDTO branchDTO = brnachs.get(i);
            branchNums.add(branchDTO.getBranchNum());
        }
        OrderQueryCondition query = new OrderQueryCondition();
        query.setToBranchNums(branchNums);
        query.setDateType(AppConstants.STATE_AUDIT_TIME);//审核时间
        query.setDateStart(dateFrom);
        query.setDateEnd(dateTo);

        List<AdjustmentOrderDTO> adjustmentOrderDTOS = adjustmentOrderRpc.findOrderByTime(systemBookCode, query, AppConstants.ADJUSTMENT_DIRECTION_OUT);

        int size = adjustmentOrderDTOS.size();
        List<TItemotherCk> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        for (int i = 0; i < size ; i++) {

            AdjustmentOrderDTO adjustmentOrderDTO = adjustmentOrderDTOS.get(i);
            TItemotherCk itemotherCk = new TItemotherCk();
            itemotherCk.setLngActivityId(adjustmentOrderDTO.getAdjustmentOrderFid());
            itemotherCk.setLngReceiptNo(adjustmentOrderDTO.getAdjustmentOrderFid());
            itemotherCk.setIntDirection("0");
            itemotherCk.setStrcustomercode("????");// 采购单位  供应商编码
            itemotherCk.setStremployeecode(adjustmentOrderDTO.getAdjustmentOrderCreator());
            itemotherCk.setStrdepartmentcode(String.valueOf(adjustmentOrderDTO.getBranchNum()));
            itemotherCk.setStrPositionName(String.valueOf(adjustmentOrderDTO.getStorehouseNum()));
            itemotherCk.setBytStatus("0");
            itemotherCk.setStrDate(time);
            itemotherCk.setStrorgcode(systemBookCode);

            List<AdjustmentOrderDetailDTO> details = adjustmentOrderDTO.getAdjustmentOrderDetails();
            for (int j = 0,len = details.size(); j < len; j++) {
                AdjustmentOrderDetailDTO detail = details.get(i);
                itemotherCk.setLngxhActivityId(String.valueOf(detail.getAdjustmentOrderDetailNum()));
                itemotherCk.setLngTollMaterialD(String.valueOf(detail.getItemNum()));
                itemotherCk.setStrTollMaterialName(detail.getAdjustmentOrderDetailItemName());
                itemotherCk.setStrTollMaterialStyle(detail.getAdjustmentOrderDetailItemSpec());
                itemotherCk.setStrUnitName(detail.getAdjustmentOrderDetailItemUnit());
                itemotherCk.setDblQuantity(detail.getAdjustmentOrderDetailQty());
                itemotherCk.setDblPurchasePrice(detail.getAdjustmentOrderDetailPrice());
                itemotherCk.setDblamount(detail.getAdjustmentOrderDetailPrice());
                /**   ????单价和金额 有什么区别
                 * private BigDecimal dblPurchasePrice;           //单价
                 private BigDecimal dblamount;                  //金额
                 * */
                list.add(itemotherCk);
            }

        }
        return list;
    }
}
