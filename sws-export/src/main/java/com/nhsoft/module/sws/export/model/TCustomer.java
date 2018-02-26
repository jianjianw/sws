package com.nhsoft.module.sws.export.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 供应商、批发客户–往来单位中间表(t_customer)
 * */
@Entity
@Table(name = "t_customer", schema = "dbo", catalog = "eabax")
public class TCustomer implements Serializable {

    @Id
    private String vendorId;                //供应商ID
    private String enName;                  //供应商名称
    private Integer managerMode;            //企业性质
    private String address;                 //企业地址
    private String postCode;                //邮政编码
    private String linkman;                 //联系人
    private String loTele;                  //联系电话
    private String flag;                    //处理标志
    private Integer lngcustomerid;          //供应商ID         金算盘供应商id

    @Column(name = "VendorId")
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }


    @Column(name = "EnName")
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }


    @Column(name = "ManagerMode")
    public Integer getManagerMode() {
        return managerMode;
    }

    public void setManagerMode(Integer managerMode) {
        this.managerMode = managerMode;
    }


    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Column(name = "PostCode")
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }


    @Column(name = "Linkman")
    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }


    @Column(name = "LOTele")
    public String getLoTele() {
        return loTele;
    }

    public void setLoTele(String loTele) {
        this.loTele = loTele;
    }


    @Column(name = "Flag")
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }


    @Column(name = "Lngcustomerid")
    public Integer getLngcustomerid() {
        return lngcustomerid;
    }

    public void setLngcustomerid(Integer lngcustomerid) {
        this.lngcustomerid = lngcustomerid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TCustomer tCustomer = (TCustomer) o;

        if (vendorId != null ? !vendorId.equals(tCustomer.vendorId) : tCustomer.vendorId != null) return false;
        if (enName != null ? !enName.equals(tCustomer.enName) : tCustomer.enName != null) return false;
        if (managerMode != null ? !managerMode.equals(tCustomer.managerMode) : tCustomer.managerMode != null)
            return false;
        if (address != null ? !address.equals(tCustomer.address) : tCustomer.address != null) return false;
        if (postCode != null ? !postCode.equals(tCustomer.postCode) : tCustomer.postCode != null) return false;
        if (linkman != null ? !linkman.equals(tCustomer.linkman) : tCustomer.linkman != null) return false;
        if (loTele != null ? !loTele.equals(tCustomer.loTele) : tCustomer.loTele != null) return false;
        if (flag != null ? !flag.equals(tCustomer.flag) : tCustomer.flag != null) return false;
        if (lngcustomerid != null ? !lngcustomerid.equals(tCustomer.lngcustomerid) : tCustomer.lngcustomerid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vendorId != null ? vendorId.hashCode() : 0;
        result = 31 * result + (enName != null ? enName.hashCode() : 0);
        result = 31 * result + (managerMode != null ? managerMode.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (postCode != null ? postCode.hashCode() : 0);
        result = 31 * result + (linkman != null ? linkman.hashCode() : 0);
        result = 31 * result + (loTele != null ? loTele.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (lngcustomerid != null ? lngcustomerid.hashCode() : 0);
        return result;
    }
}
