package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TTollMaterialDao;
import com.nhsoft.module.sws.export.model.TTollMaterial;
import com.nhsoft.module.sws.service.TTollMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TTollMaterialServiceImpl implements TTollMaterialService {

    @Autowired
    private TTollMaterialDao tTollMaterialDao;

    @Override
    public void batchSaveTollMaterial(List<TTollMaterial> tTollMaterials) {
        tTollMaterialDao.batchSaveTollMaterial(tTollMaterials);
    }
}
