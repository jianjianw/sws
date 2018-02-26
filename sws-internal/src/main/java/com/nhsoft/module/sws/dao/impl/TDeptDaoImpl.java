package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TDeptDao;
import com.nhsoft.module.sws.export.model.TDept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TDeptDaoImpl extends DaoImpl implements TDeptDao {

    @Override
    public void batchSaveDept(List<TDept> tDepts) {
        for (int i = 0,len = tDepts.size(); i < len ; i++) {
            TDept tDept = tDepts.get(i);
            currentSession().saveOrUpdate(tDept);
            if(i % 50 == 0){
                currentSession().flush();
                currentSession().clear();
            }
        }
    }
}
