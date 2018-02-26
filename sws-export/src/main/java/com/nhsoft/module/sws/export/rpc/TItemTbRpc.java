package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TItemTb;
import com.nhsoft.module.sws.export.model.TItemsalseRk;

import java.util.Date;
import java.util.List;

public interface TItemTbRpc {

    public List<TItemTb> findByCenter(String systemBookCode, Date dateFrom, Date dateTo);


}
