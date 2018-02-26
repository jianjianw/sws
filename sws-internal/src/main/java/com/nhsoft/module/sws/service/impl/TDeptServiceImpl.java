package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TDeptDao;
import com.nhsoft.module.sws.export.model.TDept;
import com.nhsoft.module.sws.service.TDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TDeptServiceImpl implements TDeptService{

    @Autowired
    private TDeptDao tDeptDao;

    @Override
    public void batchSaveDept(List<TDept> tDepts) {
        tDeptDao.batchSaveDept(tDepts);
    }
}
