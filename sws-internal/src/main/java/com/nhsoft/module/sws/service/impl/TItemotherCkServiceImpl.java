package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TItemotherCkDao;
import com.nhsoft.module.sws.export.model.TItemotherCk;
import com.nhsoft.module.sws.export.model.TItemotherRk;
import com.nhsoft.module.sws.service.TItemotherCkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TItemotherCkServiceImpl implements TItemotherCkService {

    @Autowired
    private TItemotherCkDao tItemotherCkDao;

    @Override
    public void batchSaveItemotherCk(List<TItemotherCk> itemotherCks) {
        tItemotherCkDao.batchSaveItemotherCk(itemotherCks);
    }
}
