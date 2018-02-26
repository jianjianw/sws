package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.BranchDTO;
import com.nhsoft.module.base.export.dto.OrderQueryCondition;
import com.nhsoft.module.base.export.rpc.BranchRpc;
import com.nhsoft.module.sws.export.model.TItemcgRk;
import com.nhsoft.module.sws.export.rpc.TItemcgRkRpc;
import com.nhsoft.module.sws.service.TItemcgRkService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import com.nhsoft.module.transfer.export.dto.ReceiveOrderDTO;
import com.nhsoft.module.transfer.export.rpc.ReceiveOrderRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class TItemcgRkRpcImpl implements TItemcgRkRpc {

    @Autowired
    private TItemcgRkService tItemcgRkService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSaveItemcgRk(List<TItemcgRk> tItemcgRks) {
        tItemcgRkService.batchSaveItemcgRk(tItemcgRks);
    }

    @Override
    public List<TItemcgRk> findByCenter(String systemBookCode, Date dateFrom, Date dateTo) {

        String url = nhhosUtil.getUrl(systemBookCode);
        ReceiveOrderRpc receiveOrderRpc = nhhosUtil.createCenterObject(ReceiveOrderRpc.class, url);

        BranchRpc branchRpc = nhhosUtil.createCenterObject(BranchRpc.class, url);
        List<BranchDTO> brnachs = branchRpc.findAll(systemBookCode);
        List<Integer> branchNums = new ArrayList<>();
        for (int i = 0,len = brnachs.size(); i < len ; i++) {
            BranchDTO branchDTO = brnachs.get(i);
            branchNums.add(branchDTO.getBranchNum());
        }
        OrderQueryCondition query = new OrderQueryCondition();
        query.setToBranchNums(branchNums);
        List<ReceiveOrderDTO> receiveOrderDTOS = receiveOrderRpc.findByOrderQueryCondition(systemBookCode, null, query, 0, 0);
        //  TTimeStamp


        return null;
    }
}
