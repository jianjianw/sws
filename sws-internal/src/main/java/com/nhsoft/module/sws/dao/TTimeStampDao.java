package com.nhsoft.module.sws.dao;

import com.nhsoft.module.sws.export.model.TTimeStamp;

import java.util.Date;

public interface TTimeStampDao {

    public void saveQueryTime(TTimeStamp timeStamp);

    public Object readMaxTime();
}
