package com.nhsoft.module.sws.export.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * 支付方式–支付方式(t_paystyle)
 * */
@Entity
@Table(name = "t_paystyle", schema = "dbo", catalog = "eabax")
public class TPaystyle implements Serializable {

    @Id
    private String lngplayid;
    private String strpayCode;      //机构编码
    private String strpayName;      //机构名称
    private String bytStatus;       //状态        0-新增        1-已处理


    @Column(name = "Lngplayid")
    public String getLngplayid() {
        return lngplayid;
    }

    public void setLngplayid(String lngplayid) {
        this.lngplayid = lngplayid;
    }


    @Column(name = "strpayCode")
    public String getStrpayCode() {
        return strpayCode;
    }

    public void setStrpayCode(String strpayCode) {
        this.strpayCode = strpayCode;
    }


    @Column(name = "strpayName")
    public String getStrpayName() {
        return strpayName;
    }

    public void setStrpayName(String strpayName) {
        this.strpayName = strpayName;
    }


    @Column(name = "bytStatus")
    public String getBytStatus() {
        return bytStatus;
    }

    public void setBytStatus(String bytStatus) {
        this.bytStatus = bytStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPaystyle tPaystyle = (TPaystyle) o;

        if (lngplayid != null ? !lngplayid.equals(tPaystyle.lngplayid) : tPaystyle.lngplayid != null) return false;
        if (strpayCode != null ? !strpayCode.equals(tPaystyle.strpayCode) : tPaystyle.strpayCode != null) return false;
        if (strpayName != null ? !strpayName.equals(tPaystyle.strpayName) : tPaystyle.strpayName != null) return false;
        if (bytStatus != null ? !bytStatus.equals(tPaystyle.bytStatus) : tPaystyle.bytStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lngplayid != null ? lngplayid.hashCode() : 0;
        result = 31 * result + (strpayCode != null ? strpayCode.hashCode() : 0);
        result = 31 * result + (strpayName != null ? strpayName.hashCode() : 0);
        result = 31 * result + (bytStatus != null ? bytStatus.hashCode() : 0);
        return result;
    }
}
