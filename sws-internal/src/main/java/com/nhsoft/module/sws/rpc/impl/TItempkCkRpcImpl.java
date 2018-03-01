package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.BranchDTO;
import com.nhsoft.module.base.export.dto.OrderQueryCondition;
import com.nhsoft.module.base.export.rpc.BranchRpc;
import com.nhsoft.module.inventory.export.dto.CheckOrderDTO;
import com.nhsoft.module.inventory.export.dto.CheckOrderDetailDTO;
import com.nhsoft.module.inventory.export.rpc.CheckOrderRpc;
import com.nhsoft.module.origin.export.AppConstants;
import com.nhsoft.module.origin.export.State;
import com.nhsoft.module.sws.export.model.TItempkCk;
import com.nhsoft.module.sws.export.model.TItempyRk;
import com.nhsoft.module.sws.export.rpc.TItempkCkRpc;
import com.nhsoft.module.sws.service.TItempkCkService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class TItempkCkRpcImpl implements TItempkCkRpc {

    @Autowired
    private TItempkCkService tItempkCkService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSaveItempkCk(List<TItempkCk> itempkCks) {
        tItempkCkService.batchSaveItempkCk(itempkCks);
    }

    @Override
    public List<TItempkCk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo) {

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

        List<TItempkCk> list = new ArrayList<>();


        List<CheckOrderDTO> checkOrderDTOS = checkOrderRpc.findOrderByTime(systemBookCode, query);
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        for (int i = 0,size = checkOrderDTOS.size(); i < size ; i++) {
            CheckOrderDTO checkOrderDTO = checkOrderDTOS.get(i);
            TItempkCk itempkCk = new TItempkCk();
            itempkCk.setLngActivityId(checkOrderDTO.getCheckOrderFid());
            itempkCk.setLngReceiptNo(checkOrderDTO.getCheckOrderFid());

            itempkCk.setIntDirection("0");

            itempkCk.setDblamount(checkOrderDTO.getCheckOrderMoney());//金额
            itempkCk.setStrPositionName(String.valueOf(checkOrderDTO.getStorehouseNum()));
            itempkCk.setBytStatus("0");
            itempkCk.setStrDate(time);
            itempkCk.setStrorgcode(systemBookCode);
            List<CheckOrderDetailDTO> details = checkOrderDTO.getCheckOrderDetails();
            for (int j = 0,len = details.size(); j < len ; j++) {
                CheckOrderDetailDTO detail = details.get(j);

                BigDecimal subtract = detail.getCheckOrderDetailQty().subtract(detail.getCheckOrderDetailStockAmount());
                if(subtract.compareTo(BigDecimal.ZERO) < 0) {  //盘亏
                    /**
                     *  private BigDecimal dblQuantity;                //数量
                     private BigDecimal dblPurchasePrice;          //销售价格
                     private BigDecimal dblSalePrice;               //单价
                     *
                     * */

                    itempkCk.setLngxhActivityId(String.valueOf(detail.getCheckOrderDetailNum()));
                    itempkCk.setLngTollMaterialD(String.valueOf(detail.getItemNum()));
                    itempkCk.setStrTollMaterialName(detail.getCheckOrderDetailItemName());
                    itempkCk.setStrTollMaterialStyle(detail.getCheckOrderDetailSpec());
                    itempkCk.setStrUnitName(detail.getCheckOrderDetailUseUnit());
                    itempkCk.setDblQuantity(detail.getCheckOrderDetailQty());
                    //itempkCk.setDblPurchasePrice();
                    //itempkCk.setDblSalePrice();

                    list.add(itempkCk);
                }
            }
        }

        return list;
    }


}
