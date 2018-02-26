package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TPaystyleDao;
import com.nhsoft.module.sws.export.model.TPaystyle;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TPaystyleDaoImpl extends DaoImpl implements TPaystyleDao {

    @Override
    public void batchSavePaystyle(List<TPaystyle> paystyles) {
        for (int i = 0,len = paystyles.size(); i < len; i++) {
            TPaystyle tPaystyle = paystyles.get(i);
            currentSession().saveOrUpdate(tPaystyle);
            if(i % 50 == 0){
                currentSession().flush();
                currentSession().clear();
            }
        }
    }
}
