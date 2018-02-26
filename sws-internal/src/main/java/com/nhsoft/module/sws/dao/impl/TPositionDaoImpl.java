package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TPositionDao;
import com.nhsoft.module.sws.export.model.TPosition;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TPositionDaoImpl extends DaoImpl implements TPositionDao {


    @Override
    public void batchSavePosition(List<TPosition> positions) {
        for (int i = 0,len = positions.size(); i < len; i++) {
            TPosition tPosition = positions.get(i);
            currentSession().saveOrUpdate(tPosition);
            if(i % 50 == 0){
                currentSession().flush();
                currentSession().clear();
            }
        }
    }
}
