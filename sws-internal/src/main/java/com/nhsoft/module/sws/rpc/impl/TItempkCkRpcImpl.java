package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.sws.export.model.TItempkCk;
import com.nhsoft.module.sws.export.rpc.TItempkCkRpc;
import com.nhsoft.module.sws.service.TItempkCkService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class TItempkCkRpcImpl implements TItempkCkRpc {

    @Autowired
    private TItempkCkService tItempkCkService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public List<TItempkCk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo) {
        return null;
    }


}
