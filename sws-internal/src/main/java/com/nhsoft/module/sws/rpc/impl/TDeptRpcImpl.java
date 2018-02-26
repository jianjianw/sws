package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.BranchDTO;
import com.nhsoft.module.base.export.rpc.BranchRpc;
import com.nhsoft.module.sws.export.model.TDept;
import com.nhsoft.module.sws.export.rpc.TDeptRpc;
import com.nhsoft.module.sws.service.TDeptService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TDeptRpcImpl implements TDeptRpc {

    @Autowired
    private TDeptService tDeptService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSaveDept(List<TDept> tDepts) {
        tDeptService.batchSaveDept(tDepts);
    }

    @Override
    public List<TDept> findByCenter(String systemBookCode) {
        String url = nhhosUtil.getUrl(systemBookCode);
        BranchRpc branchRpc = nhhosUtil.createCenterObject(BranchRpc.class, url);

        List<BranchDTO> branchDTOS = branchRpc.findAll(systemBookCode);

        int size = branchDTOS.size();
        List<TDept> list = new ArrayList<>(size);

        for (int i = 0; i <size ; i++) {
            BranchDTO branchDTO = branchDTOS.get(i);

            TDept tDept = new TDept();
            tDept.setLngdeptlD(String.valueOf(branchDTO.getBranchNum()));
            tDept.setStrdeptCode(branchDTO.getBranchCode());
            tDept.setStrdeptName(branchDTO.getBranchName());
            tDept.setBytStatus("1");
            tDept.setStrorgcode(systemBookCode);
            list.add(tDept);

        }
        return list;
    }
}
