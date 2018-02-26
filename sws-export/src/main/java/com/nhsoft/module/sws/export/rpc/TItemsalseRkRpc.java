package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TItemsalseRk;

import java.util.Date;
import java.util.List;

public interface TItemsalseRkRpc {


    public void batchSaveItemsalseRk(List<TItemsalseRk> itemsalseRks);



    public List<TItemsalseRk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo);
}
