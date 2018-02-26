package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TTimeStampDao;
import com.nhsoft.module.sws.export.model.TTimeStamp;
import org.springframework.stereotype.Repository;

@Repository
public class TTimeStampDaoImpl extends DaoImpl implements TTimeStampDao {

    @Override
    public void saveQueryTime(TTimeStamp timeStamp) {
        currentSession().save(timeStamp);
    }
}
