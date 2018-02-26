package com.nhsoft.module.sws.service;

import com.nhsoft.module.sws.export.model.TCustomer;

import java.util.List;

public interface TCustomerService {

    public void batchSaveCustomer(List<TCustomer> tCustomers);
}
