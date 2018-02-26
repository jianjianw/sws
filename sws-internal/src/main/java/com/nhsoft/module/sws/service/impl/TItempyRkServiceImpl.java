package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TItempyRkDao;
import com.nhsoft.module.sws.service.TItempyRkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TItempyRkServiceImpl implements TItempyRkService {

    @Autowired
    private TItempyRkDao tItempyRkDao;
}
