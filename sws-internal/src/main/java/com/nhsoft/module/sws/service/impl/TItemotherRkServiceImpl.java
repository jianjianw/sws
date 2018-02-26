package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TItemotherRkDao;
import com.nhsoft.module.sws.export.model.TItemotherRk;
import com.nhsoft.module.sws.service.TItemotherRkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TItemotherRkServiceImpl implements TItemotherRkService {

    @Autowired
    private TItemotherRkDao tItemotherRkDao;

    @Override
    public void batchSaveItemotherRk(List<TItemotherRk> itemotherRks) {
        tItemotherRkDao.batchSaveItemotherRk(itemotherRks);
    }
}
