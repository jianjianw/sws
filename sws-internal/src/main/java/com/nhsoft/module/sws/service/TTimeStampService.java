package com.nhsoft.module.sws.service;

import com.nhsoft.module.sws.export.model.TTimeStamp;

import java.util.Date;

public interface TTimeStampService {

    public void saveQueryTime(TTimeStamp timeStamp);

    public Object readMaxTime();

    public void deleteTimeStamp(Date date);
}
