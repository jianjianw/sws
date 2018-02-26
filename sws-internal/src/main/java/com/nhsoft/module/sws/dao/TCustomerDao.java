package com.nhsoft.module.sws.dao;

import com.nhsoft.module.sws.export.model.TCustomer;

import java.util.List;

public interface TCustomerDao {

    public void batchSaveCustomer(List<TCustomer> tCustomers);

}
