package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.sws.export.model.TItempyRk;
import com.nhsoft.module.sws.export.rpc.TItempyRkRpc;
import com.nhsoft.module.sws.service.TItempyRkService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class TItempyRkRpcImpl implements TItempyRkRpc {

    @Autowired
    private TItempyRkService tItempyRkService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public List<TItempyRk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo) {
        return null;
    }
}
