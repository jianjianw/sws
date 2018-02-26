package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TItemcgRk;

import java.util.Date;
import java.util.List;

public interface TItemcgRkRpc {

    public void batchSaveItemcgRk(List<TItemcgRk> tItemcgRks);

    public List<TItemcgRk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo);
}
