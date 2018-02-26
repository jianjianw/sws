package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.sws.export.model.TItemTb;
import com.nhsoft.module.sws.export.rpc.TItemTbRpc;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class TItemTbRpcImpl implements TItemTbRpc {

    @Autowired
    private TItemTbRpc tItemTbRpc;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public List<TItemTb> findByCenter(String systemBookCode, Date dateFrom, Date dateTo) {
        return null;
    }
}
