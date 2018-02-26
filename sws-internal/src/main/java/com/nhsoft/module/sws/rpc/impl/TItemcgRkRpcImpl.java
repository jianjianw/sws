package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.sws.export.model.TItemcgRk;
import com.nhsoft.module.sws.export.rpc.TItemcgRkRpc;
import com.nhsoft.module.sws.service.TItemcgRkService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import com.nhsoft.module.transfer.export.rpc.ReceiveOrderRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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



        return null;
    }
}
