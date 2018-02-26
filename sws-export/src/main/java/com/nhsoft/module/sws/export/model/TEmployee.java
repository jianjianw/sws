package com.nhsoft.module.sws.export.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * 员工–员工表	(t_Employee)
 * */
@Entity
@Table(name = "t_Employee", schema = "dbo", catalog = "eabax")
public class TEmployee implements Serializable {

    @Id
    private String lngEmployeelD;           //员工id
    private String strEmployeeCode;         //员工工号
    private String strEmployeeName;         //员工名称
    @Id
    private String strdepartmentcode;       //部门编码
    private String bytStatus;               //状态            0-新增   1-已处理
    private Integer lngErpEmployeeId;       //Erp 员工id
    private String strorgcode;              //机构


    @Column(name = "lngEmployeelD")
    public String getLngEmployeelD() {
        return lngEmployeelD;
    }

    public void setLngEmployeelD(String lngEmployeelD) {
        this.lngEmployeelD = lngEmployeelD;
    }


    @Column(name = "strEmployeeCode")
    public String getStrEmployeeCode() {
        return strEmployeeCode;
    }

    public void setStrEmployeeCode(String strEmployeeCode) {
        this.strEmployeeCode = strEmployeeCode;
    }


    @Column(name = "strEmployeeName")
    public String getStrEmployeeName() {
        return strEmployeeName;
    }

    public void setStrEmployeeName(String strEmployeeName) {
        this.strEmployeeName = strEmployeeName;
    }


    @Column(name = "strdepartmentcode")
    public String getStrdepartmentcode() {
        return strdepartmentcode;
    }

    public void setStrdepartmentcode(String strdepartmentcode) {
        this.strdepartmentcode = strdepartmentcode;
    }


    @Column(name = "bytStatus")
    public String getBytStatus() {
        return bytStatus;
    }

    public void setBytStatus(String bytStatus) {
        this.bytStatus = bytStatus;
    }


    @Column(name = "lngErpEmployeeID")
    public Integer getLngErpEmployeeId() {
        return lngErpEmployeeId;
    }

    public void setLngErpEmployeeId(Integer lngErpEmployeeId) {
        this.lngErpEmployeeId = lngErpEmployeeId;
    }


    @Column(name = "strorgcode")
    public String getStrorgcode() {
        return strorgcode;
    }

    public void setStrorgcode(String strorgcode) {
        this.strorgcode = strorgcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TEmployee tEmployee = (TEmployee) o;

        if (lngEmployeelD != null ? !lngEmployeelD.equals(tEmployee.lngEmployeelD) : tEmployee.lngEmployeelD != null)
            return false;
        if (strEmployeeCode != null ? !strEmployeeCode.equals(tEmployee.strEmployeeCode) : tEmployee.strEmployeeCode != null)
            return false;
        if (strEmployeeName != null ? !strEmployeeName.equals(tEmployee.strEmployeeName) : tEmployee.strEmployeeName != null)
            return false;
        if (strdepartmentcode != null ? !strdepartmentcode.equals(tEmployee.strdepartmentcode) : tEmployee.strdepartmentcode != null)
            return false;
        if (bytStatus != null ? !bytStatus.equals(tEmployee.bytStatus) : tEmployee.bytStatus != null) return false;
        if (lngErpEmployeeId != null ? !lngErpEmployeeId.equals(tEmployee.lngErpEmployeeId) : tEmployee.lngErpEmployeeId != null)
            return false;
        if (strorgcode != null ? !strorgcode.equals(tEmployee.strorgcode) : tEmployee.strorgcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lngEmployeelD != null ? lngEmployeelD.hashCode() : 0;
        result = 31 * result + (strEmployeeCode != null ? strEmployeeCode.hashCode() : 0);
        result = 31 * result + (strEmployeeName != null ? strEmployeeName.hashCode() : 0);
        result = 31 * result + (strdepartmentcode != null ? strdepartmentcode.hashCode() : 0);
        result = 31 * result + (bytStatus != null ? bytStatus.hashCode() : 0);
        result = 31 * result + (lngErpEmployeeId != null ? lngErpEmployeeId.hashCode() : 0);
        result = 31 * result + (strorgcode != null ? strorgcode.hashCode() : 0);
        return result;
    }
}
