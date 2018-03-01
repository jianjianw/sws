package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TTimeStamp;

import java.util.Date;

public interface TTimeStampRpc {

    public void saveQueryTime(TTimeStamp timeStamp);

    public Date readMaxTime();

    public void deleteTimeStamp(Date date);

}
