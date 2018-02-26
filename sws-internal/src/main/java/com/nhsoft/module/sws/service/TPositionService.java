package com.nhsoft.module.sws.service;

import com.nhsoft.module.sws.export.model.TPosition;

import java.util.List;

public interface TPositionService {

    public void batchSavePosition(List<TPosition> positions);
}
