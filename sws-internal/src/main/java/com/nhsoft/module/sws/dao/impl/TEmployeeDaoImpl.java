package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TEmployeeDao;
import com.nhsoft.module.sws.export.model.TEmployee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TEmployeeDaoImpl extends DaoImpl implements TEmployeeDao {


    @Override
    public void batchSaveTEmployee(List<TEmployee> tEmployees) {
        for (int i = 0,len = tEmployees.size(); i < len ; i++) {

            TEmployee tEmployee = tEmployees.get(i);
            currentSession().saveOrUpdate(tEmployee);
            if(i % 50 == 0){
                currentSession().flush();
                currentSession().clear();
            }
        }
    }
}
