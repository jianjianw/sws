package com.nhsoft.module.sws.dao;

import com.nhsoft.module.sws.export.model.TPaystyle;

import java.util.List;

public interface TPaystyleDao {

    public void batchSavePaystyle(List<TPaystyle> paystyles);
}
