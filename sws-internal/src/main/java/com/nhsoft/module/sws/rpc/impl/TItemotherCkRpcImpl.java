package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.inventory.export.rpc.AdjustmentOrderRpc;
import com.nhsoft.module.sws.export.model.TItemotherCk;
import com.nhsoft.module.sws.export.model.TItempkCk;
import com.nhsoft.module.sws.export.rpc.TItemotherCkRpc;
import com.nhsoft.module.sws.service.TItemotherCkService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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



        return null;
    }
}
