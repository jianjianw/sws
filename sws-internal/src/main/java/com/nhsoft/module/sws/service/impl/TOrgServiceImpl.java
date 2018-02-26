package com.nhsoft.module.sws.service.impl;

import com.nhsoft.module.sws.dao.TOrgDao;
import com.nhsoft.module.sws.export.model.TOrg;
import com.nhsoft.module.sws.service.TOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TOrgServiceImpl implements TOrgService {

    @Autowired
    private TOrgDao tOrgDao;

    @Override
    public void batchSaveOrg(List<TOrg> tOrgs) {
        tOrgDao.batchSaveOrg(tOrgs);
    }
}
