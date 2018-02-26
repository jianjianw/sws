package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TTypeDao;
import com.nhsoft.module.sws.export.model.TType;
import com.nhsoft.module.sws.service.TTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TTypeServiceImpl implements TTypeService {

    @Autowired
    private TTypeDao tTypeDao;

    @Override
    public void batchSaveType(List<TType> types) {
        tTypeDao.batchSaveType(types);
    }
}
