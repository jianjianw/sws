package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TCustomerDao;
import com.nhsoft.module.sws.export.model.TCustomer;
import com.nhsoft.module.sws.service.TCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCustomerServiceImpl implements TCustomerService {

    @Autowired
    private TCustomerDao tCustomerDao;

    @Override
    public void batchSaveCustomer(List<TCustomer> tCustomers) {
        tCustomerDao.batchSaveCustomer(tCustomers);
    }
}
