package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.BranchDTO;
import com.nhsoft.module.base.export.dto.OrderQueryCondition;
import com.nhsoft.module.base.export.rpc.BranchRpc;
import com.nhsoft.module.inventory.export.dto.CheckOrderDTO;
import com.nhsoft.module.inventory.export.dto.CheckOrderDetailDTO;
import com.nhsoft.module.inventory.export.rpc.CheckOrderRpc;
import com.nhsoft.module.origin.export.AppConstants;
import com.nhsoft.module.origin.export.State;
import com.nhsoft.module.sws.export.model.TItempyRk;
import com.nhsoft.module.sws.export.rpc.TItempyRkRpc;
import com.nhsoft.module.sws.service.TItempyRkService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import com.nhsoft.module.wholesale.export.dto.ShipOrderDTO;
import com.nhsoft.module.wholesale.export.dto.ShipOrderDetailDTO;
import com.nhsoft.module.wholesale.export.rpc.ShipOrderRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class TItempyRkRpcImpl implements TItempyRkRpc {

    @Autowired
    private TItempyRkService tItempyRkService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSaveItempyRk(List<TItempyRk> itempyRks) {
        tItempyRkService.batchSaveItempyRk(itempyRks);
    }

    @Override
    public List<TItempyRk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo) {

        String url = nhhosUtil.getUrl(systemBookCode);
        CheckOrderRpc checkOrderRpc = nhhosUtil.createCenterObject(CheckOrderRpc.class, url);


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
        State state = new State();
        state.setStateCode(AppConstants.STATE_AUDIT_CODE);
        query.setState(state);


        List<CheckOrderDTO> checkOrderDTOS = checkOrderRpc.findOrderByTime(systemBookCode, query);

        List<TItempyRk> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        for (int i = 0,size = checkOrderDTOS.size(); i < size; i++) {
            CheckOrderDTO checkOrderDTO = checkOrderDTOS.get(i);
            TItempyRk itempyRk = new TItempyRk();
            itempyRk.setLngActivityId(checkOrderDTO.getCheckOrderFid());
            itempyRk.setLngReceiptNo(checkOrderDTO.getCheckOrderFid());

            itempyRk.setIntDirection("0");  //审批-0
            itempyRk.setStremployeecode(checkOrderDTO.getCheckOrderCreator());
            itempyRk.setStrdepartmentcode(String.valueOf(checkOrderDTO.getBranchNum()));
            itempyRk.setStrPositionName(String.valueOf(checkOrderDTO.getStorehouseNum()));
            itempyRk.setBytStatus("0");     //  0-未处理  1-已处理
            itempyRk.setStrDate(time);
            itempyRk.setStrorgcode(systemBookCode);
            List<CheckOrderDetailDTO> checkOrderDetails = checkOrderDTO.getCheckOrderDetails();

            for (int j = 0,len = checkOrderDetails.size(); j < len ; j++) {
                CheckOrderDetailDTO detailDTO = checkOrderDetails.get(j);
                BigDecimal subtract = detailDTO.getCheckOrderDetailQty().subtract(detailDTO.getCheckOrderDetailStockAmount());
                if(subtract.compareTo(BigDecimal.ZERO) > 0){  //盘盈
                    itempyRk.setLngxhActivityId(String.valueOf(detailDTO.getCheckOrderDetailNum()));
                    itempyRk.setLngTollMaterialD(String.valueOf(detailDTO.getItemNum()));
                    itempyRk.setStrTollMaterialName(detailDTO.getCheckOrderDetailItemName());
                    itempyRk.setStrTollMaterialStyle(detailDTO.getCheckOrderDetailSpec());
                    itempyRk.setStrUnitName(detailDTO.getCheckOrderDetailItemUnit());
                    itempyRk.setDblQuantity(detailDTO.getCheckOrderDetailQty());
                    itempyRk.setDblPurchasePrice(detailDTO.getCheckOrderDetailPrice());
                    list.add(itempyRk);
                }
            }
        }

        return list;
    }
}
