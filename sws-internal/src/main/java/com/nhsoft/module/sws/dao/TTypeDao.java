package com.nhsoft.module.sws.dao;

import com.nhsoft.module.sws.export.model.TType;

import java.util.List;

public interface TTypeDao {

    public void batchSaveType(List<TType> types);
}
