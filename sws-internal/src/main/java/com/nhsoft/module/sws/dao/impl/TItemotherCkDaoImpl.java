package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TItemotherCkDao;
import com.nhsoft.module.sws.export.model.TItemotherCk;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TItemotherCkDaoImpl extends DaoImpl implements TItemotherCkDao {


    @Override
    public void batchSaveItemotherCk(List<TItemotherCk> itemotherCks) {

        for (int i = 0,len = itemotherCks.size(); i < len ; i++) {
            TItemotherCk tItemotherCk = itemotherCks.get(i);
            currentSession().save(tItemotherCk);
            if(i % 50 == 0){
                currentSession().flush();
                currentSession().clear();
            }
        }
    }
}
