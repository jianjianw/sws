package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TItemDaaDao;
import com.nhsoft.module.sws.service.TItemDaaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TItemDaaServiceImpl implements TItemDaaService {

    @Autowired
    private TItemDaaDao tItemDaaDao;

}
