package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TEmployee;

import java.util.List;

public interface TEmployeeRpc {

    public void batchSaveTEmployee(List<TEmployee> tEmployees);

    public List<TEmployee> findByCenter(String systemBookCode);
}
