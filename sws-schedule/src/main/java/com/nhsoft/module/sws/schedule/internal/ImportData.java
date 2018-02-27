package com.nhsoft.module.sws.schedule.internal;


import com.nhsoft.module.sws.export.model.*;
import com.nhsoft.module.sws.export.rpc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class ImportData {

    @Autowired
    private TTollMaterialRpc tTollMaterialRpc;
    @Autowired
    private TCustomerRpc tCustomerRpc;
    @Autowired
    private TPositionRpc tPositionRpc;
    @Autowired
    private TDeptRpc tDeptRpc;
    @Autowired
    private TEmployeeRpc tEmployeeRpc;
    @Autowired
    private TOrgRpc tOrgRpc;
    @Autowired
    private TPaystyleRpc tPaystyleRpc;
    @Autowired
    private TTypeRpc tTypeRpc;


    @Autowired
    private TItemcgRkRpc tItemcgRkRpc;



    public void saveTollMaterial(String systemBookCode){
        List<TTollMaterial> tollMaterial = tTollMaterialRpc.findByCenter(systemBookCode);
        tTollMaterialRpc.batchSaveTollMaterial(tollMaterial);
    }

    public void saveCustomer(String systemBookCode){
        List<TCustomer> customers = tCustomerRpc.findByCenter(systemBookCode);
        tCustomerRpc.batchSaveCustomer(customers);
    }

    public void savePosition(String systemBookCode){
        List<TPosition> positions = tPositionRpc.findByCenter(systemBookCode);
        tPositionRpc.batchSavePosition(positions);
    }

    public void saveDept(String systemBookCode){
        List<TDept> depts = tDeptRpc.findByCenter(systemBookCode);
        tDeptRpc.batchSaveDept(depts);
    }

    public void saveEmployee(String systemBookCode){
        List<TEmployee> employees = tEmployeeRpc.findByCenter(systemBookCode);
        tEmployeeRpc.batchSaveTEmployee(employees);
    }

    public void saveOrg(String systemBookCode){
        List<TOrg> tOrgs = tOrgRpc.findByCenter(systemBookCode);
        tOrgRpc.batchSaveOrg(tOrgs);
    }

    public void savePaystyle(String systemBookCode){
        List<TPaystyle> tPaystyles = tPaystyleRpc.findByCenter(systemBookCode);
        tPaystyleRpc.batchSavePaystyle(tPaystyles);
    }

    public void saveType(String systemBookCode){
        List<TType> tTypes = tTypeRpc.findByCenter(systemBookCode);
        tTypeRpc.batchSaveType(tTypes);
    }

    public void saveItemcgRk(String systemBookCode,Date dateFrom,Date dateTo){
        List<TItemcgRk> tItemcgRks = tItemcgRkRpc.findByCenter(systemBookCode, dateFrom, dateTo);
        tItemcgRkRpc.batchSaveItemcgRk(tItemcgRks);

    }

}
