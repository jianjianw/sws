package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TTollMaterialDao;
import com.nhsoft.module.sws.export.model.TTollMaterial;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TTollMaterialDaoImpl extends DaoImpl implements TTollMaterialDao {


    @Override
    public void batchSaveTollMaterial(List<TTollMaterial> tTollMaterials) {

        StringBuilder sb = new StringBuilder();
        sb.append("delete from t_TollMaterial ");

        for (int i = 0,len = tTollMaterials.size(); i < len ; i++) {
            TTollMaterial tTollMaterial = tTollMaterials.get(i);
            currentSession().save(tTollMaterial);
            if(i % 50 == 0){
                currentSession().flush();
                currentSession().clear();
            }
        }
    }
}
