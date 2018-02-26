package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.inventory.export.rpc.AdjustmentOrderRpc;
import com.nhsoft.module.sws.export.model.TItemotherRk;
import com.nhsoft.module.sws.export.rpc.TItemotherRkRpc;
import com.nhsoft.module.sws.service.TItemotherRkService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.TaskNamespaceHandler;
import org.springframework.stereotype.Component;

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

        return null;
    }
}
