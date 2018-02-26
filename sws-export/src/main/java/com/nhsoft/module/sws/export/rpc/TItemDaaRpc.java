package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TItemDaa;

import java.util.Date;
import java.util.List;

public interface TItemDaaRpc {

    public List<TItemDaa> findByCenter(String systemBookCode, Date dateFrom, Date dateTo);
}
