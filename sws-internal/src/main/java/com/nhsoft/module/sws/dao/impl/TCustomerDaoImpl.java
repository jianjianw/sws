package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TCustomerDao;
import com.nhsoft.module.sws.export.model.TCustomer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TCustomerDaoImpl extends DaoImpl implements TCustomerDao {


    @Override
    public void batchSaveCustomer(List<TCustomer> tCustomers) {
        for (int i = 0,len = tCustomers.size(); i <len ; i++) {
            TCustomer tCustomer = tCustomers.get(i);
            currentSession().saveOrUpdate(tCustomer);
            if(i % 50 == 0){
                currentSession().flush();
                currentSession().clear();
            }
        }
    }
}
