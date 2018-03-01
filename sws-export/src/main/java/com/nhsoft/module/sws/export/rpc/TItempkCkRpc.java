package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TItemotherCk;
import com.nhsoft.module.sws.export.model.TItempkCk;

import java.util.Date;
import java.util.List;

public interface TItempkCkRpc {

    public void batchSaveItempkCk(List<TItempkCk> itempkCks);

    public List<TItempkCk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo);

}
