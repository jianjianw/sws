package com.nhsoft.module.sws.dao.impl;

import com.nhsoft.module.sws.dao.TTimeStampDao;
import com.nhsoft.module.sws.export.model.TTimeStamp;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class TTimeStampDaoImpl extends DaoImpl implements TTimeStampDao {

    @Override
    public void saveQueryTime(TTimeStamp timeStamp) {
        currentSession().save(timeStamp);
    }

    @Override
    public Object readMaxTime() {
        StringBuilder sb = new StringBuilder();
        sb.append("select max(queryTime) from t_timestamp");
        SQLQuery sqlQuery = currentSession().createSQLQuery(sb.toString());
        return sqlQuery.uniqueResult();
    }
}
