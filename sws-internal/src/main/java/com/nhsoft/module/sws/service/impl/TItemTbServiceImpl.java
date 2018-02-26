package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TItemTbDao;
import com.nhsoft.module.sws.service.TItemTbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TItemTbServiceImpl implements TItemTbService {

    @Autowired
    private TItemTbDao tItemTbDao;
}
