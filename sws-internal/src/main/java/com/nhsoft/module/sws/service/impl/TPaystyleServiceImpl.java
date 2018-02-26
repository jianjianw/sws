package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TPaystyleDao;
import com.nhsoft.module.sws.export.model.TPaystyle;
import com.nhsoft.module.sws.service.TPaystyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TPaystyleServiceImpl implements TPaystyleService {

    @Autowired
    private TPaystyleDao tPaystyleDao;

    @Override
    public void batchSavePaystyle(List<TPaystyle> paystyles) {
        tPaystyleDao.batchSavePaystyle(paystyles);
    }
}
