package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.PosPaymentType;
import com.nhsoft.module.base.export.rpc.BookResourceRpc;
import com.nhsoft.module.sws.export.model.TPaystyle;
import com.nhsoft.module.sws.export.rpc.TPaystyleRpc;
import com.nhsoft.module.sws.service.TPaystyleService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class TPaystyleRpcImpl implements TPaystyleRpc {

    @Autowired
    private TPaystyleService tPaystyleService;

    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSavePaystyle(List<TPaystyle> paystyles) {
        tPaystyleService.batchSavePaystyle(paystyles);
    }

    @Override
    public List<TPaystyle> findByCenter(String systemBookCode) {
        String url = nhhosUtil.getUrl(systemBookCode);
        BookResourceRpc resourceRpc = nhhosUtil.createCenterObject(BookResourceRpc.class, url);
        List<PosPaymentType> posPaymentTypes = resourceRpc.findPosPaymentTypes(systemBookCode);
        int size = posPaymentTypes.size();
        List<TPaystyle> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            PosPaymentType posPaymentType = posPaymentTypes.get(i);
            TPaystyle tPaystyle = new TPaystyle();
            tPaystyle.setLngplayid(posPaymentType.getPaymentTypeCode());
            tPaystyle.setStrpayCode(posPaymentType.getPaymentTypeCode());
            tPaystyle.setStrpayName(posPaymentType.getPaymentTypeName());
            tPaystyle.setBytStatus("1");
            list.add(tPaystyle);
        }
        return list;
    }
}
