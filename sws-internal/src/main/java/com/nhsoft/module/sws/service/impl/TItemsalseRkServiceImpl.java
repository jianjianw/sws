package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TItemsalseRkDao;
import com.nhsoft.module.sws.export.model.TItemsalseRk;
import com.nhsoft.module.sws.service.TItemsalseRkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TItemsalseRkServiceImpl implements TItemsalseRkService {

    @Autowired
    private TItemsalseRkDao tItemsalseRkDao;

    @Override
    public void batchSaveItemsalseRk(List<TItemsalseRk> itemsalseRks) {

        tItemsalseRkDao.batchSaveItemsalseRk(itemsalseRks);

    }
}
