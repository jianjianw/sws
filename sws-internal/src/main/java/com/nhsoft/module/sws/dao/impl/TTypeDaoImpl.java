package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TTypeDao;
import com.nhsoft.module.sws.export.model.TType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TTypeDaoImpl extends DaoImpl implements TTypeDao {

    @Override
    public void batchSaveType(List<TType> types) {
        for(int i = 0,len = types.size(); i < len; i++){
            TType tType = types.get(i);
            currentSession().saveOrUpdate(tType);
            if(i % 50 == 0){
                currentSession().flush();
                currentSession().clear();
            }
        }
    }
}
