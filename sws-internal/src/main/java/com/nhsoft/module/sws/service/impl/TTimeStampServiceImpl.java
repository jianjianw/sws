package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TTimeStampDao;
import com.nhsoft.module.sws.export.model.TTimeStamp;
import com.nhsoft.module.sws.service.TTimeStampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TTimeStampServiceImpl implements TTimeStampService {

    @Autowired
    private TTimeStampDao tTimeStampDao;

    @Override
    public void saveQueryTime(TTimeStamp timeStamp) {
        tTimeStampDao.saveQueryTime(timeStamp);
    }

    @Override
    public Object readMaxTime() {
        return tTimeStampDao.readMaxTime();
    }

    @Override
    public void deleteTimeStamp(Date date) {
        tTimeStampDao.deleteTimeStamp(date);
    }


}
