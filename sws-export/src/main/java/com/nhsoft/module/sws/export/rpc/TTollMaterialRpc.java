package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TTollMaterial;

import java.util.Date;
import java.util.List;

public interface TTollMaterialRpc {

    public void batchSaveTollMaterial(List<TTollMaterial> tTollMaterials);

    public List<TTollMaterial> findByCenter(String systemBookCode);
}
