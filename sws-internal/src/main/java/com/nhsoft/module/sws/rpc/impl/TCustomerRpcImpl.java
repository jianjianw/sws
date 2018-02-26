package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.SupplierDTO;
import com.nhsoft.module.base.export.rpc.PosItemRpc;
import com.nhsoft.module.base.export.rpc.SupplierRpc;
import com.nhsoft.module.base.export.rpc.WholesaleUserRpc;
import com.nhsoft.module.sws.export.model.TCustomer;
import com.nhsoft.module.sws.export.rpc.TCustomerRpc;
import com.nhsoft.module.sws.service.TCustomerService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TCustomerRpcImpl implements TCustomerRpc {

    @Autowired
    private TCustomerService tCustomerService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSaveCustomer(List<TCustomer> tCustomers) {
        tCustomerService.batchSaveCustomer(tCustomers);
    }

    @Override
    public List<TCustomer> findByCenter(String systemBookCode) {

        String url = nhhosUtil.getUrl(systemBookCode);
        SupplierRpc supplierRpc = nhhosUtil.createCenterObject(SupplierRpc.class, url);
        List<SupplierDTO> suppliers = supplierRpc.findAll(systemBookCode);
        int size = suppliers.size();
        List<TCustomer> list = new ArrayList<>(size);
        for (int i = 0; i <size ; i++) {
            TCustomer customer = new TCustomer();
            SupplierDTO supplierDTO = suppliers.get(i);
            customer.setVendorId(String.valueOf(supplierDTO.getSupplierNum()));
            customer.setEnName(supplierDTO.getSupplierName());
            customer.setAddress(supplierDTO.getSupplierAddr());
            customer.setPostCode(supplierDTO.getSupplierPostcode());
            customer.setLinkman(supplierDTO.getSupplierLinkman());
            customer.setLoTele(supplierDTO.getSupplierLinktel());
            customer.setFlag("0");
            list.add(customer);
        }
        return list;
    }
}
