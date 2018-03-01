package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TItempkCkDao;
import com.nhsoft.module.sws.export.model.TItempkCk;
import com.nhsoft.module.sws.service.TItempkCkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TItempkCkServiceImpl implements TItempkCkService {

    @Autowired
    private TItempkCkDao tItempkCkDao;

    @Override
    public void batchSaveItempkCk(List<TItempkCk> itempkCks) {
        tItempkCkDao.batchSaveItempkCk(itempkCks);
    }
}
