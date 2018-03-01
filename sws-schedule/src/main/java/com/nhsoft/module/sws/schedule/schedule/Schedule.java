package com.nhsoft.module.sws.schedule.schedule;



import com.nhsoft.module.sws.schedule.internal.ImportData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;



@Component
public class Schedule {




    @Autowired
    private ImportData importData;


    String systemBookCode = "4020";

    @Scheduled(cron="0 0 0 * * *")
    public void saveTollMaterial(){

        importData.saveTollMaterial("4344");
        System.out.println("保存成功");
    }

    @Scheduled(cron="0 0 0 * * *")
    public void saveCustomer(){
        importData.saveCustomer(systemBookCode);
        System.out.println("保存成功");

    }

    @Scheduled(cron="0 0 0 * * *")
    public void savePosition(){
        importData.savePosition(systemBookCode);
        System.out.println("保存成功");
    }

    @Scheduled(cron="0 0 0 * * *")
    public void saveDept(){
        importData.saveDept(systemBookCode);
        System.out.println("保存成功");
    }

    @Scheduled(cron="0 0 0 * * *")
    public void saveEmployee(){
        importData.saveEmployee(systemBookCode);
        System.out.println("保存成功");
    }

    @Scheduled(cron="0 0 0 * * *")
    public void saveOrg(){
        importData.saveOrg(systemBookCode);
        System.out.println("保存成功");

    }

    @Scheduled(cron="0 0 0 * * *")
    public void savePaystyle(){
        importData.savePaystyle(systemBookCode);
        System.out.println("保存成功");
    }

    @Scheduled(cron="0 0 0 * * *")
    public void saveType(){
       importData.saveType(systemBookCode);

    }

    @Scheduled(cron="0 0 0 * * *")
    public void saveItemcgRk(){
        importData.saveItemcgRk(systemBookCode);
    }


    @Scheduled(cron="0 0 0 * * *")
    public void saveItemotherRk(){
        importData.saveItemotherRk(systemBookCode);
    }

    @Scheduled(cron="0 0 0 * * *")
    public void saveItemotherCk(){
        importData.saveItemotherCk(systemBookCode);
    }

    @Scheduled(cron="0 0 * * * *")
    public void saveItempyRk(){
        importData.saveItempyRk(systemBookCode);
    }

    @Scheduled(cron="0 0 * * * *")
    public void saveItempkCk(){
        importData.saveItempkCk(systemBookCode);
    }


    @Scheduled(cron="0 0 * * * *")
    public void saveItemDaa(){

    }

    @Scheduled(cron="0 0 * * * *")
    public void saveItemsalseRk(){

    }

    @Scheduled(cron="0 0 * * * *")
    public void saveItemTb(){

    }



    @Scheduled(cron="0 0 22 * * *")
    public void deleteTimeStamp(){

    }











}
