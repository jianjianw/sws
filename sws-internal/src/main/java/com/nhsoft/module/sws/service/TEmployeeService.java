package com.nhsoft.module.sws.service;

import com.nhsoft.module.sws.export.model.TEmployee;

import java.util.List;

public interface TEmployeeService {

    public void batchSaveTEmployee(List<TEmployee> tEmployees);
}
