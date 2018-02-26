package com.nhsoft.module.sws.service;

import com.nhsoft.module.sws.export.model.TOrg;

import java.util.List;

public interface TOrgService {

    public void batchSaveOrg(List<TOrg> tOrgs);
}
