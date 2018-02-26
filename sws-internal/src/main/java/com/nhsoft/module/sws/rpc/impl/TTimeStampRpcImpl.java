package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.sws.export.model.TTimeStamp;
import com.nhsoft.module.sws.export.rpc.TTimeStampRpc;
import com.nhsoft.module.sws.service.TTimeStampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TTimeStampRpcImpl implements TTimeStampRpc {

    @Autowired
    private TTimeStampService tTimeStampService;

    @Override
    public void saveQueryTime(TTimeStamp timeStamp) {
        tTimeStampService.saveQueryTime(timeStamp);

    }
}
