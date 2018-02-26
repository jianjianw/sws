package com.nhsoft.module.sws.dao;

import com.nhsoft.module.sws.export.model.TTollMaterial;

import java.util.List;

public interface TTollMaterialDao {

    public void batchSaveTollMaterial(List<TTollMaterial> tTollMaterials);

}
