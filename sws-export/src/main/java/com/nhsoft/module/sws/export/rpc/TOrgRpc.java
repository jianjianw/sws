package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TOrg;

import java.util.List;

public interface TOrgRpc {

    public void batchSaveOrg(List<TOrg> tOrgs);

    public List<TOrg> findByCenter(String systemBookCode);
}
