package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TItemcgRkDao;
import com.nhsoft.module.sws.export.model.TItemcgRk;
import com.nhsoft.module.sws.service.TItemcgRkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TItemcgRkServiceImpl implements TItemcgRkService {

    @Autowired
    private TItemcgRkDao tItemcgRkDao;

    @Override
    public void batchSaveItemcgRk(List<TItemcgRk> tItemcgRks) {
        tItemcgRkDao.batchSaveItemcgRk(tItemcgRks);
    }
}
