package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TItemotherRkDao;
import com.nhsoft.module.sws.export.model.TItemotherRk;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TItemotherRkDaoImpl extends DaoImpl implements TItemotherRkDao {

    @Override
    public void batchSaveItemotherRk(List<TItemotherRk> itemotherRks) {

        for (int i = 0,len = itemotherRks.size(); i < len ; i++) {
            TItemotherRk tItemotherRk = itemotherRks.get(i);
            currentSession().save(tItemotherRk);
            if(i % 50 == 0){
                currentSession().flush();
                currentSession().clear();
            }
        }

    }
}
