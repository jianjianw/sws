package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.PosItemTypeParam;
import com.nhsoft.module.base.export.rpc.BookResourceRpc;
import com.nhsoft.module.sws.export.model.TType;
import com.nhsoft.module.sws.export.rpc.TTypeRpc;
import com.nhsoft.module.sws.service.TTypeService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class TTypeRpcImpl implements TTypeRpc {

    @Autowired
    private TTypeService tTypeService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSaveType(List<TType> types) {
        tTypeService.batchSaveType(types);
    }

    @Override
    public List<TType> findByCenter(String systemBookCode) {

        String url = nhhosUtil.getUrl(systemBookCode);
        BookResourceRpc bookResourceRpc = nhhosUtil.createCenterObject(BookResourceRpc.class, url);
        List<PosItemTypeParam> posItemTypeParams = bookResourceRpc.findPosItemTypeParams(systemBookCode);

        int size = posItemTypeParams.size();
        List<TType> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            PosItemTypeParam param = posItemTypeParams.get(i);
            TType tType = new TType();
            tType.setLngtypelD(param.getPosItemTypeCode());
            tType.setStrtypeCode(param.getPosItemTypeCode());
            tType.setStrtypeName(param.getPosItemTypeName());
            tType.setBytStatus("1");
            tType.setLngErptypeId(param.getPosItemTypeCode());
            list.add(tType);
        }


        return list;
    }
}
