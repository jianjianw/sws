package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TItempyRkDao;
import com.nhsoft.module.sws.export.model.TItempyRk;
import com.nhsoft.module.sws.service.TItempyRkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TItempyRkServiceImpl implements TItempyRkService {

    @Autowired
    private TItempyRkDao tItempyRkDao;


    @Override
    public void batchSaveItempyRk(List<TItempyRk> itempyRks) {
        tItempyRkDao.batchSaveItempyRk(itempyRks);
    }
}
