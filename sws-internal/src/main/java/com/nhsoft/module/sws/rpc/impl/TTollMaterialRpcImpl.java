package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.PosItemDTO;
import com.nhsoft.module.base.export.dto.PosItemDetailDTO;
import com.nhsoft.module.base.export.dto.PosItemQuery;
import com.nhsoft.module.base.export.rpc.PosItemRpc;
import com.nhsoft.module.base.export.rpc.SupplierRpc;
import com.nhsoft.module.pos.export.rpc.PosOrderRpc;
import com.nhsoft.module.sws.export.model.TTollMaterial;
import com.nhsoft.module.sws.export.rpc.TTollMaterialRpc;
import com.nhsoft.module.sws.service.TTollMaterialService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import com.nhsoft.module.transfer.export.dto.ItemPurchaseDetailDTO;
import com.nhsoft.module.transfer.export.rpc.PurchaseOrderRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class TTollMaterialRpcImpl implements TTollMaterialRpc {

    @Autowired
    private TTollMaterialService tTollMaterialService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSaveTollMaterial(List<TTollMaterial> tTollMaterials) {
        tTollMaterialService.batchSaveTollMaterial(tTollMaterials);
    }

    @Override
    public List<TTollMaterial> findByCenter(String systemBookCode) {
        String url = nhhosUtil.getUrl(systemBookCode);
        PosItemRpc posItemRpc = nhhosUtil.createCenterObject(PosItemRpc.class, url);

        List<PosItemDTO> posItems = posItemRpc.find(systemBookCode, null, null, null);

        int size = posItems.size();
        List<TTollMaterial> list = new ArrayList<>(size);

        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        for (int i = 0; i < size ; i++) {
            PosItemDTO dto = posItems.get(i);
            TTollMaterial tTollMaterial = new TTollMaterial();
            tTollMaterial.setLngTollMaterialD(String.valueOf(dto.getItemNum()));
            tTollMaterial.setStrTollMaterialCode(String.valueOf(dto.getItemCode()));
            tTollMaterial.setStrTollMaterialName(dto.getItemName());
            tTollMaterial.setStrTollMaterialStyle(dto.getItemSpec());
            tTollMaterial.setStrUnitName(dto.getItemUnit());
            tTollMaterial.setDblFactor("???");      //换算关系(基本与库存)
            tTollMaterial.setDblPurchasePrice(dto.getItemCostPrice());//采购价格
            tTollMaterial.setDblSalePrice(dto.getItemRegularPrice());//销售价格
            tTollMaterial.setStrSystemName(systemBookCode);                      //新希望系统名称
            tTollMaterial.setStrItemtypeName(dto.getItemCategory());        //物资类别
            tTollMaterial.setTaxrate(new BigDecimal(123));//???              //税率
            tTollMaterial.setBytStatus("3");                          // 记录状态
            tTollMaterial.setStrDate(time);                             //写入时间
            tTollMaterial.setStrorgname(systemBookCode);                //来自哪个机构
            list.add(tTollMaterial);
        }



        return list;
    }
}
