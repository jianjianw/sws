package com.nhsoft.module.sws.schedule.api;


import com.nhsoft.module.sws.schedule.internal.ImportData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/importData" )
public class ImportDataApi {

    @Autowired
    private ImportData importData;

    @RequestMapping(method = RequestMethod.GET,value = "/deleteTimeStamp")
    public String deleteTimeStamp(){
        importData.deleteTimeStamp();
        return "success";
    }
}
