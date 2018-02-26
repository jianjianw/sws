package com.nhsoft.module.sws.export.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * 门店–部门表	(t_dept)
 * */
@Entity
@Table(name = "t_dept", schema = "dbo", catalog = "eabax")
public class TDept implements Serializable {

    @Id
    private String lngdeptlD;           //部门id
    private String strdeptCode;         //部门编码
    private String strdeptName;         //部门名称
    private String bytStatus;           //状态            0-新增        1-已处理
    private Integer lngErpdeptId;       //erp 部门id
    private String strorgcode;          //机构


    @Column(name = "lngdeptlD")
    public String getLngdeptlD() {
        return lngdeptlD;
    }

    public void setLngdeptlD(String lngdeptlD) {
        this.lngdeptlD = lngdeptlD;
    }


    @Column(name = "strdeptCode")
    public String getStrdeptCode() {
        return strdeptCode;
    }

    public void setStrdeptCode(String strdeptCode) {
        this.strdeptCode = strdeptCode;
    }


    @Column(name = "strdeptName")
    public String getStrdeptName() {
        return strdeptName;
    }

    public void setStrdeptName(String strdeptName) {
        this.strdeptName = strdeptName;
    }


    @Column(name = "bytStatus")
    public String getBytStatus() {
        return bytStatus;
    }

    public void setBytStatus(String bytStatus) {
        this.bytStatus = bytStatus;
    }


    @Column(name = "lngErpdeptID")
    public Integer getLngErpdeptId() {
        return lngErpdeptId;
    }

    public void setLngErpdeptId(Integer lngErpdeptId) {
        this.lngErpdeptId = lngErpdeptId;
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

        TDept tDept = (TDept) o;

        if (lngdeptlD != null ? !lngdeptlD.equals(tDept.lngdeptlD) : tDept.lngdeptlD != null) return false;
        if (strdeptCode != null ? !strdeptCode.equals(tDept.strdeptCode) : tDept.strdeptCode != null) return false;
        if (strdeptName != null ? !strdeptName.equals(tDept.strdeptName) : tDept.strdeptName != null) return false;
        if (bytStatus != null ? !bytStatus.equals(tDept.bytStatus) : tDept.bytStatus != null) return false;
        if (lngErpdeptId != null ? !lngErpdeptId.equals(tDept.lngErpdeptId) : tDept.lngErpdeptId != null) return false;
        if (strorgcode != null ? !strorgcode.equals(tDept.strorgcode) : tDept.strorgcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lngdeptlD != null ? lngdeptlD.hashCode() : 0;
        result = 31 * result + (strdeptCode != null ? strdeptCode.hashCode() : 0);
        result = 31 * result + (strdeptName != null ? strdeptName.hashCode() : 0);
        result = 31 * result + (bytStatus != null ? bytStatus.hashCode() : 0);
        result = 31 * result + (lngErpdeptId != null ? lngErpdeptId.hashCode() : 0);
        result = 31 * result + (strorgcode != null ? strorgcode.hashCode() : 0);
        return result;
    }
}
