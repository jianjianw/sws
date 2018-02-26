package com.nhsoft.module.sws.export.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * 门店分组区域–机构(t_org)
 * */
@Entity
@Table(name = "t_org", schema = "dbo", catalog = "eabax")
public class TOrg implements Serializable {

    @Id
    private String lngorglD;
    private String strorgCode;      //机构编码
    private String strorgName;      //机构名称
    private String bytStatus;       //状态            0-新增        1-已处理
    private Integer lngErporgId;    //erpId


    @Column(name = "lngorglD")
    public String getLngorglD() {
        return lngorglD;
    }

    public void setLngorglD(String lngorglD) {
        this.lngorglD = lngorglD;
    }


    @Column(name = "strorgCode")
    public String getStrorgCode() {
        return strorgCode;
    }

    public void setStrorgCode(String strorgCode) {
        this.strorgCode = strorgCode;
    }


    @Column(name = "strorgName")
    public String getStrorgName() {
        return strorgName;
    }

    public void setStrorgName(String strorgName) {
        this.strorgName = strorgName;
    }


    @Column(name = "bytStatus")
    public String getBytStatus() {
        return bytStatus;
    }

    public void setBytStatus(String bytStatus) {
        this.bytStatus = bytStatus;
    }


    @Column(name = "lngErporgID")
    public Integer getLngErporgId() {
        return lngErporgId;
    }

    public void setLngErporgId(Integer lngErporgId) {
        this.lngErporgId = lngErporgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TOrg tOrg = (TOrg) o;

        if (lngorglD != null ? !lngorglD.equals(tOrg.lngorglD) : tOrg.lngorglD != null) return false;
        if (strorgCode != null ? !strorgCode.equals(tOrg.strorgCode) : tOrg.strorgCode != null) return false;
        if (strorgName != null ? !strorgName.equals(tOrg.strorgName) : tOrg.strorgName != null) return false;
        if (bytStatus != null ? !bytStatus.equals(tOrg.bytStatus) : tOrg.bytStatus != null) return false;
        if (lngErporgId != null ? !lngErporgId.equals(tOrg.lngErporgId) : tOrg.lngErporgId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lngorglD != null ? lngorglD.hashCode() : 0;
        result = 31 * result + (strorgCode != null ? strorgCode.hashCode() : 0);
        result = 31 * result + (strorgName != null ? strorgName.hashCode() : 0);
        result = 31 * result + (bytStatus != null ? bytStatus.hashCode() : 0);
        result = 31 * result + (lngErporgId != null ? lngErporgId.hashCode() : 0);
        return result;
    }
}
