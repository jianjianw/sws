package com.nhsoft.module.sws.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DaoImpl {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory azureSessionFactory;

    public Session currentSession() {

        return azureSessionFactory.getCurrentSession();
    }
}
