package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TPaystyle;

import java.util.List;

public interface TPaystyleRpc {

    public void batchSavePaystyle(List<TPaystyle> paystyles);

    public List<TPaystyle> findByCenter(String systemBookCode);

}
