package com.nhsoft.module.sws.dao;

import com.nhsoft.module.sws.export.model.TEmployee;

import java.util.List;

public interface TEmployeeDao {

    public void batchSaveTEmployee(List<TEmployee> tEmployees);
}
