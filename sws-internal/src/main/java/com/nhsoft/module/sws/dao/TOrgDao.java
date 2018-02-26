package com.nhsoft.module.sws.dao;

import com.nhsoft.module.sws.export.model.TOrg;

import java.util.List;

public interface TOrgDao {

    public void batchSaveOrg(List<TOrg> tOrgs);

}
