package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TItempyRkDao;
import com.nhsoft.module.sws.export.model.TItempyRk;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public class TItempyRkDaoImpl extends DaoImpl implements TItempyRkDao {


    @Override
    public void batchSaveItempyRk(List<TItempyRk> itempyRks) {
        for (int i = 0,len = itempyRks.size(); i < len; i++) {
            TItempyRk itempyRk = itempyRks.get(i);
            currentSession().save(itempyRk);

            if(i % 50 == 0){
                currentSession().flush();
                currentSession().clear();
            }

        }
    }
}
