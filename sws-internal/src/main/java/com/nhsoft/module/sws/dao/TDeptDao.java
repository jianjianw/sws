package com.nhsoft.module.sws.dao;

import com.nhsoft.module.sws.export.model.TDept;

import java.util.List;

public interface TDeptDao {

    public void batchSaveDept(List<TDept> tDepts);

}
