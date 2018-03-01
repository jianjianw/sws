package com.nhsoft.module.sws.rpc.impl;

import com.nhsoft.module.base.export.dto.EmployeeDTO;
import com.nhsoft.module.base.export.rpc.EmployeeRpc;
import com.nhsoft.module.sws.export.model.TEmployee;
import com.nhsoft.module.sws.export.rpc.TEmployeeRpc;
import com.nhsoft.module.sws.service.TEmployeeService;
import com.nhsoft.module.sws.utils.NhhosUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class TEmployeeRpcImpl implements TEmployeeRpc {

    @Autowired
    private TEmployeeService tEmployeeService;
    @Autowired
    private NhhosUtil nhhosUtil;

    @Override
    public void batchSaveTEmployee(List<TEmployee> tEmployees) {
        tEmployeeService.batchSaveTEmployee(tEmployees);
    }

    @Override
    public List<TEmployee> findByCenter(String systemBookCode) {
        String url = nhhosUtil.getUrl(systemBookCode);
        EmployeeRpc employeeRpc = nhhosUtil.createCenterObject(EmployeeRpc.class, url);


        List<EmployeeDTO> employeeDTOS = employeeRpc.find(systemBookCode, null);
        List<EmployeeDTO> collect = employeeDTOS.stream().filter(a -> a.getEmployeeNum().equals(402099058)).collect(Collectors.toList());
        //Map<EmployeeDTO, Long> collect = employeeDTOS.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int size = employeeDTOS.size();
        List<TEmployee> list = new ArrayList<>(size);
        for (int i = 0; i < size ; i++) {
            EmployeeDTO dto = employeeDTOS.get(i);
            TEmployee employee = new TEmployee();
            employee.setLngEmployeelD(String.valueOf(dto.getEmployeeNum()));
            employee.setStrEmployeeCode(dto.getEmployeeCode());
            employee.setStrEmployeeName(dto.getEmployeeName());
            employee.setStrdepartmentcode(String.valueOf(dto.getBranchNum()));
            employee.setBytStatus("0");
            employee.setStrorgcode(systemBookCode);
            list.add(employee);
        }

        return list;
    }
}
