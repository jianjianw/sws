package com.nhsoft.module.sws.dao;

import com.nhsoft.module.sws.export.model.TPosition;

import java.util.List;

public interface TPositionDao {

    public void batchSavePosition(List<TPosition> positions);
}
