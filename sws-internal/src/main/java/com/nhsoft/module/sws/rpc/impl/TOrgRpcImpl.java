package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.BranchRegionDTO;
import com.nhsoft.module.base.export.rpc.BranchRegionRpc;
import com.nhsoft.module.sws.export.model.TOrg;
import com.nhsoft.module.sws.export.rpc.TOrgRpc;
import com.nhsoft.module.sws.service.TOrgService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TOrgRpcImpl implements TOrgRpc {

    @Autowired
    private TOrgService tOrgService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSaveOrg(List<TOrg> tOrgs) {
        tOrgService.batchSaveOrg(tOrgs);
    }

    @Override
    public List<TOrg> findByCenter(String systemBookCode) {
        String url = nhhosUtil.getUrl(systemBookCode);
        BranchRegionRpc regionRpc = nhhosUtil.createCenterObject(BranchRegionRpc.class, url);
        List<BranchRegionDTO> regionDTOS = regionRpc.findAll(systemBookCode);
        int size = regionDTOS.size();
        List<TOrg> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            BranchRegionDTO branchRegionDTO = regionDTOS.get(i);
            TOrg tOrg  = new TOrg();
            tOrg.setLngorglD(String.valueOf(branchRegionDTO.getBranchRegionNum()));
            tOrg.setStrorgCode(branchRegionDTO.getBranchRegionCode());
            tOrg.setStrorgName(branchRegionDTO.getBranchRegionName());
            tOrg.setBytStatus("1");
            list.add(tOrg);
        }
        return list;
    }
}
