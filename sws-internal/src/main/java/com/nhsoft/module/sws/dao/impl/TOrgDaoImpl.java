package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TOrgDao;
import com.nhsoft.module.sws.export.model.TOrg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TOrgDaoImpl extends DaoImpl implements TOrgDao {


    @Override
    public void batchSaveOrg(List<TOrg> tOrgs) {
        for (int i = 0,len = tOrgs.size(); i < len ; i++) {
            TOrg tOrg = tOrgs.get(i);
            currentSession().saveOrUpdate(tOrg);
            if(i % 50 == 0){
                currentSession().flush();
                currentSession().clear();
            }
        }
    }
}
