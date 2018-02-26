package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TPositionDao;
import com.nhsoft.module.sws.export.model.TPosition;
import com.nhsoft.module.sws.service.TPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TPositionServiceImpl implements TPositionService {

    @Autowired
    private TPositionDao tPositionDao;

    @Override
    public void batchSavePosition(List<TPosition> positions) {
        tPositionDao.batchSavePosition(positions);
    }
}
