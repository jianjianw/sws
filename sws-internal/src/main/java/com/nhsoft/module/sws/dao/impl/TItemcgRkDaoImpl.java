package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TItemcgRkDao;
import com.nhsoft.module.sws.export.model.TItemcgRk;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TItemcgRkDaoImpl extends DaoImpl implements TItemcgRkDao {
    @Override
    public void batchSaveItemcgRk(List<TItemcgRk> tItemcgRks) {

        for (int i = 0,len = tItemcgRks.size() ; i < len ; i++) {
            TItemcgRk tItemcgRk = tItemcgRks.get(i);
            currentSession().save(tItemcgRk);
            if(i % 50 == 0){
                currentSession().flush();
                currentSession().clear();
            }
        }
    }
}
