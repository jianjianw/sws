package com.nhsoft.module.sws.schedule.internal;


import com.nhsoft.module.sws.export.model.*;
import com.nhsoft.module.sws.export.rpc.*;
import com.nhsoft.module.sws.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class ImportData {



    @Autowired
    private TTimeStampRpc timeStampRpc;

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
    @Autowired
    private TItemotherRkRpc tItemotherRkRpc;
    @Autowired
    private TItemotherCkRpc tItemotherCkRpc;
    @Autowired
    private TItempyRkRpc tItempyRkRpc;
    @Autowired
    private TItempkCkRpc tItempkCkRpc;





    @Autowired
    private TItemDaaRpc tItemDaaRpc;

    @Autowired
    private TItemsalseRkRpc tItemsalseRkRpc;
    @Autowired
    private TItemTbRpc tItemTbRpc;



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

    public void saveItemcgRk(String systemBookCode){

        Calendar calendar = Calendar.getInstance();
        Date dateTo = calendar.getTime();
        TTimeStamp tTimeStamp = new TTimeStamp();
        tTimeStamp.setQueryTime(dateTo);
        timeStampRpc.saveQueryTime(tTimeStamp);

        List<TItemcgRk> tItemcgRks = null;
        int hour = calendar.get(Calendar.HOUR);
        if(hour < 1){
            Date minDate = DateUtil.getMinOfDate(dateTo);
            tItemcgRks = tItemcgRkRpc.findByCenter(systemBookCode, minDate, dateTo);
        }else{
            Date dateFrom = timeStampRpc.readMaxTime();
            tItemcgRks = tItemcgRkRpc.findByCenter(systemBookCode, dateFrom, dateTo);
        }

        tItemcgRkRpc.batchSaveItemcgRk(tItemcgRks);

    }

    public void saveItemotherRk(String systemBookCode){
        Calendar calendar = Calendar.getInstance();
        Date dateTo = calendar.getTime();
        TTimeStamp tTimeStamp = new TTimeStamp();
        tTimeStamp.setQueryTime(dateTo);
        timeStampRpc.saveQueryTime(tTimeStamp);

        List<TItemotherRk> itemotherRks = null;
        int hour = calendar.get(Calendar.HOUR);
        if(hour < 1){
            Date minDate = DateUtil.getMinOfDate(dateTo);
            itemotherRks = tItemotherRkRpc.findByCenter(systemBookCode, minDate, dateTo);
        }else{
            Date dateFrom = timeStampRpc.readMaxTime();
            itemotherRks = tItemotherRkRpc.findByCenter(systemBookCode, dateFrom, dateTo);
        }

        tItemotherRkRpc.batchSaveItemotherRk(itemotherRks);
        System.out.println("数据存储成功");
    }

    public void saveItemotherCk(String systemBookCode){

        Calendar calendar = Calendar.getInstance();
        Date dateTo = calendar.getTime();
        TTimeStamp tTimeStamp = new TTimeStamp();
        tTimeStamp.setQueryTime(dateTo);
        timeStampRpc.saveQueryTime(tTimeStamp);
        int hour = calendar.get(Calendar.HOUR);
        List<TItemotherCk> itemotherCks = null;

        if(hour < 1){
            Date minDate = DateUtil.getMinOfDate(dateTo);
            itemotherCks = tItemotherCkRpc.findByCenter(systemBookCode, minDate, dateTo);
        }else{
            Date dateFrom = timeStampRpc.readMaxTime();
            itemotherCks = tItemotherCkRpc.findByCenter(systemBookCode, dateFrom, dateTo);
        }
        tItemotherCkRpc.batchSaveItemotherCk(itemotherCks);
        System.out.println("数据存储成功");

    }


    public void saveItempyRk(String systemBookCode){
        Calendar calendar = Calendar.getInstance();
        Date dateTo = calendar.getTime();
        TTimeStamp tTimeStamp = new TTimeStamp();
        tTimeStamp.setQueryTime(dateTo);
        timeStampRpc.saveQueryTime(tTimeStamp);
        int hour = calendar.get(Calendar.HOUR);
        List<TItempyRk> itempyRks = null;
        if(hour < 1){
            Date minDate = DateUtil.getMinOfDate(dateTo);
            itempyRks = tItempyRkRpc.findByCenter(systemBookCode, minDate, dateTo);
        }else{
            Date dateFrom = timeStampRpc.readMaxTime();
            itempyRks = tItempyRkRpc.findByCenter(systemBookCode, dateFrom, dateTo);
        }

        tItempyRkRpc.batchSaveItempyRk(itempyRks);
        System.out.println("数据存储成功");


    }


    public void saveItempkCk(String systemBookCode){
        Calendar calendar = Calendar.getInstance();
        Date dateTo = calendar.getTime();
        TTimeStamp tTimeStamp = new TTimeStamp();
        tTimeStamp.setQueryTime(dateTo);
        timeStampRpc.saveQueryTime(tTimeStamp);
        int hour = calendar.get(Calendar.HOUR);
        List<TItempkCk> itempkCks = null;

        if(hour < 1){
            Date minDate = DateUtil.getMinOfDate(dateTo);
            itempkCks = tItempkCkRpc.findByCenter(systemBookCode, minDate, dateTo);
        }else{
            Date dateFrom = timeStampRpc.readMaxTime();
            itempkCks = tItempkCkRpc.findByCenter(systemBookCode, dateFrom, dateTo);
        }

        tItempkCkRpc.batchSaveItempkCk(itempkCks);
        System.out.println("数据存储成功");
    }







    public void deleteTimeStamp(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        Date time = DateUtil.getMinOfDate(calendar.getTime());
        timeStampRpc.deleteTimeStamp(time);
    }

}
