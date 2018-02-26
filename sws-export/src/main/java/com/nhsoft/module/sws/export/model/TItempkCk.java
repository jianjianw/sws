package com.nhsoft.module.sws.export.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
/**
 * 盘点单盘亏部分–盘亏出库单(t_itempk_ck)
 * */
@Entity
@Table(name = "t_itempk_ck", schema = "dbo", catalog = "eabax")
public class TItempkCk implements Serializable{

    @Id
    private String lngActivityId;                   //业务ID
    @Id
    private String lngReceiptNo;                    //单据号
    @Id
    private String lngxhActivityId;                 //序号
    private String intDirection;                    //审批及作废标志
    private String lngTollMaterialD;                //物资ID
    private String strTollMaterialName;             //材料名称
    private String strTollMaterialStyle;            //材料规格
    private String strUnitName;                      //计量单位
    private BigDecimal dblQuantity;                //数量
    private BigDecimal dblPurchasePrice;          //销售价格
    private BigDecimal dblSalePrice;               //单价
    private BigDecimal dblamount;                  //金额
    private String strPositionName;                 //货位名称
    private String bytStatus;                        //记录状态
    private Date strDate;                            //写入时间
    private Date strLastDate;                        //回写时间
    private Integer lngErpActivityId;               //eRP回写主表
    private String isnotposition;                   //货位是否存在
    private String isnotunit;                       //计量单位是否存在
    private String strorgcode;                      //机构


    @Column(name = "lngActivityID")
    public String getLngActivityId() {
        return lngActivityId;
    }

    public void setLngActivityId(String lngActivityId) {
        this.lngActivityId = lngActivityId;
    }


    @Column(name = "lngReceiptNO")
    public String getLngReceiptNo() {
        return lngReceiptNo;
    }

    public void setLngReceiptNo(String lngReceiptNo) {
        this.lngReceiptNo = lngReceiptNo;
    }


    @Column(name = "LngxhActivityID")
    public String getLngxhActivityId() {
        return lngxhActivityId;
    }

    public void setLngxhActivityId(String lngxhActivityId) {
        this.lngxhActivityId = lngxhActivityId;
    }


    @Column(name = "intDirection")
    public String getIntDirection() {
        return intDirection;
    }

    public void setIntDirection(String intDirection) {
        this.intDirection = intDirection;
    }


    @Column(name = "lngTollMaterialD")
    public String getLngTollMaterialD() {
        return lngTollMaterialD;
    }

    public void setLngTollMaterialD(String lngTollMaterialD) {
        this.lngTollMaterialD = lngTollMaterialD;
    }


    @Column(name = "strTollMaterialName")
    public String getStrTollMaterialName() {
        return strTollMaterialName;
    }

    public void setStrTollMaterialName(String strTollMaterialName) {
        this.strTollMaterialName = strTollMaterialName;
    }


    @Column(name = "strTollMaterialStyle")
    public String getStrTollMaterialStyle() {
        return strTollMaterialStyle;
    }

    public void setStrTollMaterialStyle(String strTollMaterialStyle) {
        this.strTollMaterialStyle = strTollMaterialStyle;
    }


    @Column(name = "strUnitName")
    public String getStrUnitName() {
        return strUnitName;
    }

    public void setStrUnitName(String strUnitName) {
        this.strUnitName = strUnitName;
    }


    @Column(name = "dblQuantity")
    public BigDecimal getDblQuantity() {
        return dblQuantity;
    }

    public void setDblQuantity(BigDecimal dblQuantity) {
        this.dblQuantity = dblQuantity;
    }


    @Column(name = "dblPurchasePrice")
    public BigDecimal getDblPurchasePrice() {
        return dblPurchasePrice;
    }

    public void setDblPurchasePrice(BigDecimal dblPurchasePrice) {
        this.dblPurchasePrice = dblPurchasePrice;
    }


    @Column(name = "dblSalePrice")
    public BigDecimal getDblSalePrice() {
        return dblSalePrice;
    }

    public void setDblSalePrice(BigDecimal dblSalePrice) {
        this.dblSalePrice = dblSalePrice;
    }


    @Column(name = "dblamount")
    public BigDecimal getDblamount() {
        return dblamount;
    }

    public void setDblamount(BigDecimal dblamount) {
        this.dblamount = dblamount;
    }


    @Column(name = "strPositionName")
    public String getStrPositionName() {
        return strPositionName;
    }

    public void setStrPositionName(String strPositionName) {
        this.strPositionName = strPositionName;
    }


    @Column(name = "bytStatus")
    public String getBytStatus() {
        return bytStatus;
    }

    public void setBytStatus(String bytStatus) {
        this.bytStatus = bytStatus;
    }


    @Column(name = "strDate")
    public Date getStrDate() {
        return strDate;
    }

    public void setStrDate(Date strDate) {
        this.strDate = strDate;
    }


    @Column(name = "strLastDate")
    public Date getStrLastDate() {
        return strLastDate;
    }

    public void setStrLastDate(Date strLastDate) {
        this.strLastDate = strLastDate;
    }


    @Column(name = "lngErpActivityID")
    public Integer getLngErpActivityId() {
        return lngErpActivityId;
    }

    public void setLngErpActivityId(Integer lngErpActivityId) {
        this.lngErpActivityId = lngErpActivityId;
    }


    @Column(name = "isnotposition")
    public String getIsnotposition() {
        return isnotposition;
    }

    public void setIsnotposition(String isnotposition) {
        this.isnotposition = isnotposition;
    }


    @Column(name = "isnotunit")
    public String getIsnotunit() {
        return isnotunit;
    }

    public void setIsnotunit(String isnotunit) {
        this.isnotunit = isnotunit;
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

        TItempkCk tItempkCk = (TItempkCk) o;

        if (lngActivityId != null ? !lngActivityId.equals(tItempkCk.lngActivityId) : tItempkCk.lngActivityId != null)
            return false;
        if (lngReceiptNo != null ? !lngReceiptNo.equals(tItempkCk.lngReceiptNo) : tItempkCk.lngReceiptNo != null)
            return false;
        if (lngxhActivityId != null ? !lngxhActivityId.equals(tItempkCk.lngxhActivityId) : tItempkCk.lngxhActivityId != null)
            return false;
        if (intDirection != null ? !intDirection.equals(tItempkCk.intDirection) : tItempkCk.intDirection != null)
            return false;
        if (lngTollMaterialD != null ? !lngTollMaterialD.equals(tItempkCk.lngTollMaterialD) : tItempkCk.lngTollMaterialD != null)
            return false;
        if (strTollMaterialName != null ? !strTollMaterialName.equals(tItempkCk.strTollMaterialName) : tItempkCk.strTollMaterialName != null)
            return false;
        if (strTollMaterialStyle != null ? !strTollMaterialStyle.equals(tItempkCk.strTollMaterialStyle) : tItempkCk.strTollMaterialStyle != null)
            return false;
        if (strUnitName != null ? !strUnitName.equals(tItempkCk.strUnitName) : tItempkCk.strUnitName != null)
            return false;
        if (dblQuantity != null ? !dblQuantity.equals(tItempkCk.dblQuantity) : tItempkCk.dblQuantity != null)
            return false;
        if (dblPurchasePrice != null ? !dblPurchasePrice.equals(tItempkCk.dblPurchasePrice) : tItempkCk.dblPurchasePrice != null)
            return false;
        if (dblSalePrice != null ? !dblSalePrice.equals(tItempkCk.dblSalePrice) : tItempkCk.dblSalePrice != null)
            return false;
        if (dblamount != null ? !dblamount.equals(tItempkCk.dblamount) : tItempkCk.dblamount != null) return false;
        if (strPositionName != null ? !strPositionName.equals(tItempkCk.strPositionName) : tItempkCk.strPositionName != null)
            return false;
        if (bytStatus != null ? !bytStatus.equals(tItempkCk.bytStatus) : tItempkCk.bytStatus != null) return false;
        if (strDate != null ? !strDate.equals(tItempkCk.strDate) : tItempkCk.strDate != null) return false;
        if (strLastDate != null ? !strLastDate.equals(tItempkCk.strLastDate) : tItempkCk.strLastDate != null)
            return false;
        if (lngErpActivityId != null ? !lngErpActivityId.equals(tItempkCk.lngErpActivityId) : tItempkCk.lngErpActivityId != null)
            return false;
        if (isnotposition != null ? !isnotposition.equals(tItempkCk.isnotposition) : tItempkCk.isnotposition != null)
            return false;
        if (isnotunit != null ? !isnotunit.equals(tItempkCk.isnotunit) : tItempkCk.isnotunit != null) return false;
        if (strorgcode != null ? !strorgcode.equals(tItempkCk.strorgcode) : tItempkCk.strorgcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lngActivityId != null ? lngActivityId.hashCode() : 0;
        result = 31 * result + (lngReceiptNo != null ? lngReceiptNo.hashCode() : 0);
        result = 31 * result + (lngxhActivityId != null ? lngxhActivityId.hashCode() : 0);
        result = 31 * result + (intDirection != null ? intDirection.hashCode() : 0);
        result = 31 * result + (lngTollMaterialD != null ? lngTollMaterialD.hashCode() : 0);
        result = 31 * result + (strTollMaterialName != null ? strTollMaterialName.hashCode() : 0);
        result = 31 * result + (strTollMaterialStyle != null ? strTollMaterialStyle.hashCode() : 0);
        result = 31 * result + (strUnitName != null ? strUnitName.hashCode() : 0);
        result = 31 * result + (dblQuantity != null ? dblQuantity.hashCode() : 0);
        result = 31 * result + (dblPurchasePrice != null ? dblPurchasePrice.hashCode() : 0);
        result = 31 * result + (dblSalePrice != null ? dblSalePrice.hashCode() : 0);
        result = 31 * result + (dblamount != null ? dblamount.hashCode() : 0);
        result = 31 * result + (strPositionName != null ? strPositionName.hashCode() : 0);
        result = 31 * result + (bytStatus != null ? bytStatus.hashCode() : 0);
        result = 31 * result + (strDate != null ? strDate.hashCode() : 0);
        result = 31 * result + (strLastDate != null ? strLastDate.hashCode() : 0);
        result = 31 * result + (lngErpActivityId != null ? lngErpActivityId.hashCode() : 0);
        result = 31 * result + (isnotposition != null ? isnotposition.hashCode() : 0);
        result = 31 * result + (isnotunit != null ? isnotunit.hashCode() : 0);
        result = 31 * result + (strorgcode != null ? strorgcode.hashCode() : 0);
        return result;
    }
}
