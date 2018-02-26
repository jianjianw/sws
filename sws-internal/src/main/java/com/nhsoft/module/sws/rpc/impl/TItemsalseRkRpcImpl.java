package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.pos.export.rpc.PosOrderRpc;
import com.nhsoft.module.sws.export.model.TItemsalseRk;
import com.nhsoft.module.sws.export.rpc.TItemsalseRkRpc;
import com.nhsoft.module.sws.service.TItemsalseRkService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class TItemsalseRkRpcImpl implements TItemsalseRkRpc {

    @Autowired
    private TItemsalseRkService tItemsalseRkService;
    @Autowired
    private NhhosUtil nhhosUtil;


    @Override
    public void batchSaveItemsalseRk(List<TItemsalseRk> itemsalseRks) {
        tItemsalseRkService.batchSaveItemsalseRk(itemsalseRks);
    }

    @Override
    public List<TItemsalseRk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo) {

        String url = nhhosUtil.getUrl(systemBookCode);
        PosOrderRpc posOrderRpc = nhhosUtil.createCenterObject(PosOrderRpc.class, url);
        List<Object[]> objects = posOrderRpc.findOrderDetail(systemBookCode, null, dateFrom, dateTo, null);
        /**
         * .add(Projections.property("p.branchNum"))
         .add(Projections.property("p.orderTime"))
         .add(Projections.property("detail.itemNum"))
         .add(Projections.property("detail.orderDetailPaymentMoney"))
         .add(Projections.property("detail.orderDetailCost"))
         .add(Projections.property("detail.orderDetailGrossProfit"))
         .add(Projections.property("p.orderNo"))
         .add(Projections.property("detail.orderDetailStdPrice"))
         .add(Projections.property("detail.orderDetailPrice"))
         .add(Projections.property("detail.orderDetailAmount"))
         .add(Projections.property("detail.orderDetailStateCode")));
         *
         *
         * date 是营业日
         * */


        return null;
    }
}
