package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TItemDaa;
import com.nhsoft.module.sws.export.model.TItemotherCk;
import com.nhsoft.module.sws.export.model.TItempkCk;

import java.util.Date;
import java.util.List;

public interface TItemotherCkRpc {


    public void batchSaveItemotherCk(List<TItemotherCk> itemotherCks);

    public List<TItemotherCk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo);
}
