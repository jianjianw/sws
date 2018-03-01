package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TItempkCkDao;
import com.nhsoft.module.sws.export.model.TItempkCk;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public class TItempkCkDaoImpl extends DaoImpl implements TItempkCkDao {


    @Override
    public void batchSaveItempkCk(List<TItempkCk> itempkCks) {

        for (int i = 0,len = itempkCks.size(); i < len ; i++) {
            TItempkCk tItempkCk = itempkCks.get(i);
            currentSession().save(tItempkCk);

            if(i % 50 == 0){
                currentSession().flush();
                currentSession().clear();
            }
        }
    }
}
