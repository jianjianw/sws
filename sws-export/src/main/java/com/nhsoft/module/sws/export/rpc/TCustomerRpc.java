package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TCustomer;

import java.util.List;

public interface TCustomerRpc {

    public void batchSaveCustomer(List<TCustomer> tCustomers);

    public List<TCustomer> findByCenter(String systemBookCode);
}
