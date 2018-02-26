package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TDept;

import java.util.List;

public interface TDeptRpc {

    public void batchSaveDept(List<TDept> tDepts);

    public List<TDept> findByCenter(String systemBookCode);

}
