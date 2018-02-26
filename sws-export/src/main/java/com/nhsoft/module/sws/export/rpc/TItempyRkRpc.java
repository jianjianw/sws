package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TItempkCk;
import com.nhsoft.module.sws.export.model.TItempyRk;

import java.util.Date;
import java.util.List;

public interface TItempyRkRpc {


    public List<TItempyRk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo);

}
