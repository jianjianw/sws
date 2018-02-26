package com.nhsoft.module.sws.export.rpc;

import com.nhsoft.module.sws.export.model.TPosition;

import java.util.List;

public interface TPositionRpc {


    public void batchSavePosition(List<TPosition> positions);

    public List<TPosition> findByCenter(String systemBookCode);
}
