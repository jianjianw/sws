package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TType;

import java.util.List;

public interface TTypeRpc {

    public void batchSaveType(List<TType> types);

    public List<TType> findByCenter(String systemBookCode);
}
