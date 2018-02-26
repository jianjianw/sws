package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.StorehouseDTO;
import com.nhsoft.module.base.export.rpc.StorehouseRpc;
import com.nhsoft.module.sws.export.model.TPosition;
import com.nhsoft.module.sws.export.rpc.TPositionRpc;
import com.nhsoft.module.sws.service.TPositionService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TPositionRpcImpl implements TPositionRpc {

    @Autowired
    private TPositionService tPositionService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSavePosition(List<TPosition> positions) {
        tPositionService.batchSavePosition(positions);
    }

    @Override
    public List<TPosition> findByCenter(String systemBookCode) {
        String url = nhhosUtil.getUrl(systemBookCode);
        StorehouseRpc storehouseRpc = nhhosUtil.createCenterObject(StorehouseRpc.class, url);
        List<StorehouseDTO> storehouseDTOS = storehouseRpc.findByBranchs(systemBookCode,null);
        int size = storehouseDTOS.size();
        List<TPosition> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            StorehouseDTO dto = storehouseDTOS.get(i);

            TPosition tPosition = new TPosition();
            tPosition.setLngpositionlD(String.valueOf(dto.getStorehouseNum()));
            tPosition.setStrPositionCode(dto.getStorehouseCode());
            tPosition.setStrPositionName(dto.getStorehouseName());
            tPosition.setBytStatus("1");
            list.add(tPosition);
        }
        return list;
    }


}
