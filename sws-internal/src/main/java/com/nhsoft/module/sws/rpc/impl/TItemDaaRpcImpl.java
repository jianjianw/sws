package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.sws.export.model.TItemDaa;
import com.nhsoft.module.sws.export.rpc.TItemDaaRpc;
import com.nhsoft.module.sws.service.TItemDaaService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class TItemDaaRpcImpl implements TItemDaaRpc {

    @Autowired
    private TItemDaaService tItemDaaService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public List<TItemDaa> findByCenter(String systemBookCode, Date dateFrom, Date dateTo) {
        return null;
    }
}
