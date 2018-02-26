package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TEmployeeDao;
import com.nhsoft.module.sws.export.model.TEmployee;
import com.nhsoft.module.sws.service.TEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TEmployeeServiceImpl implements TEmployeeService {

    @Autowired
    private TEmployeeDao tEmployeeDao;

    @Override
    public void batchSaveTEmployee(List<TEmployee> tEmployees) {
        tEmployeeDao.batchSaveTEmployee(tEmployees);
    }
}
