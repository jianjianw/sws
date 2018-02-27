package com.nhsoft.module.sws.export.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 收货单–物品采购单中间表	(t_itemcg_rk)
 * */
@Entity
@Table(name = "t_itemcg_rk", schema = "dbo", catalog = "eabax")
public class TItemcgRk implements Serializable {

    @Id
    private String lngActivityId;                   //业务ID            新希望主表id
    @Id
    private String lngReceiptNo;                    //单据号
    @Id
    private String lngxhActivityId;                 //序号
    private String intDirection;                    //审批及作废标志       审批-0
    private String strplaymethod;                   //支付方式
    private String strcustomercode;                 //采购单位
    private String lngTollMaterialD;                //物资ID
    private String strTollMaterialName;             //材料名称
    private String strTollMaterialStyle;            //材料规格
    private String strUnitName;                      //计量单位           对应：最小单位
    private BigDecimal dblQuantity;                //数量
    private BigDecimal dblPurchasePrice;          //采购价格
    private String stremployeecode;                  //员工名称
    private String strdepartmentcode;               //部门名称
    private String strPositionName;                 //货位名称
    private String strinvoicenumber;                //发票号
    private String bytStatus;                        //处理标志           0—未处理  1--已处理
    private Date strDate;                            //写入时间
    private Date strLastDate;                       //回写时间
    private Integer lngErpActivityId;               //eRP回写主表
    private String isnotposition;                   //货位是否存在
    private String isnotunit;                       //计量单位是否存在
    private String strorgcode;                      //机构代码


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


    @Column(name = "strplaymethod")
    public String getStrplaymethod() {
        return strplaymethod;
    }

    public void setStrplaymethod(String strplaymethod) {
        this.strplaymethod = strplaymethod;
    }


    @Column(name = "strcustomercode")
    public String getStrcustomercode() {
        return strcustomercode;
    }

    public void setStrcustomercode(String strcustomercode) {
        this.strcustomercode = strcustomercode;
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


    @Column(name = "Stremployeecode")
    public String getStremployeecode() {
        return stremployeecode;
    }

    public void setStremployeecode(String stremployeecode) {
        this.stremployeecode = stremployeecode;
    }


    @Column(name = "Strdepartmentcode")
    public String getStrdepartmentcode() {
        return strdepartmentcode;
    }

    public void setStrdepartmentcode(String strdepartmentcode) {
        this.strdepartmentcode = strdepartmentcode;
    }


    @Column(name = "strPositionName")
    public String getStrPositionName() {
        return strPositionName;
    }

    public void setStrPositionName(String strPositionName) {
        this.strPositionName = strPositionName;
    }


    @Column(name = "strinvoicenumber")
    public String getStrinvoicenumber() {
        return strinvoicenumber;
    }

    public void setStrinvoicenumber(String strinvoicenumber) {
        this.strinvoicenumber = strinvoicenumber;
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

        TItemcgRk tItemcgRk = (TItemcgRk) o;

        if (lngActivityId != null ? !lngActivityId.equals(tItemcgRk.lngActivityId) : tItemcgRk.lngActivityId != null)
            return false;
        if (lngReceiptNo != null ? !lngReceiptNo.equals(tItemcgRk.lngReceiptNo) : tItemcgRk.lngReceiptNo != null)
            return false;
        if (lngxhActivityId != null ? !lngxhActivityId.equals(tItemcgRk.lngxhActivityId) : tItemcgRk.lngxhActivityId != null)
            return false;
        if (intDirection != null ? !intDirection.equals(tItemcgRk.intDirection) : tItemcgRk.intDirection != null)
            return false;
        if (strplaymethod != null ? !strplaymethod.equals(tItemcgRk.strplaymethod) : tItemcgRk.strplaymethod != null)
            return false;
        if (strcustomercode != null ? !strcustomercode.equals(tItemcgRk.strcustomercode) : tItemcgRk.strcustomercode != null)
            return false;
        if (lngTollMaterialD != null ? !lngTollMaterialD.equals(tItemcgRk.lngTollMaterialD) : tItemcgRk.lngTollMaterialD != null)
            return false;
        if (strTollMaterialName != null ? !strTollMaterialName.equals(tItemcgRk.strTollMaterialName) : tItemcgRk.strTollMaterialName != null)
            return false;
        if (strTollMaterialStyle != null ? !strTollMaterialStyle.equals(tItemcgRk.strTollMaterialStyle) : tItemcgRk.strTollMaterialStyle != null)
            return false;
        if (strUnitName != null ? !strUnitName.equals(tItemcgRk.strUnitName) : tItemcgRk.strUnitName != null)
            return false;
        if (dblQuantity != null ? !dblQuantity.equals(tItemcgRk.dblQuantity) : tItemcgRk.dblQuantity != null)
            return false;
        if (dblPurchasePrice != null ? !dblPurchasePrice.equals(tItemcgRk.dblPurchasePrice) : tItemcgRk.dblPurchasePrice != null)
            return false;
        if (stremployeecode != null ? !stremployeecode.equals(tItemcgRk.stremployeecode) : tItemcgRk.stremployeecode != null)
            return false;
        if (strdepartmentcode != null ? !strdepartmentcode.equals(tItemcgRk.strdepartmentcode) : tItemcgRk.strdepartmentcode != null)
            return false;
        if (strPositionName != null ? !strPositionName.equals(tItemcgRk.strPositionName) : tItemcgRk.strPositionName != null)
            return false;
        if (strinvoicenumber != null ? !strinvoicenumber.equals(tItemcgRk.strinvoicenumber) : tItemcgRk.strinvoicenumber != null)
            return false;
        if (bytStatus != null ? !bytStatus.equals(tItemcgRk.bytStatus) : tItemcgRk.bytStatus != null) return false;
        if (strDate != null ? !strDate.equals(tItemcgRk.strDate) : tItemcgRk.strDate != null) return false;
        if (strLastDate != null ? !strLastDate.equals(tItemcgRk.strLastDate) : tItemcgRk.strLastDate != null)
            return false;
        if (lngErpActivityId != null ? !lngErpActivityId.equals(tItemcgRk.lngErpActivityId) : tItemcgRk.lngErpActivityId != null)
            return false;
        if (isnotposition != null ? !isnotposition.equals(tItemcgRk.isnotposition) : tItemcgRk.isnotposition != null)
            return false;
        if (isnotunit != null ? !isnotunit.equals(tItemcgRk.isnotunit) : tItemcgRk.isnotunit != null) return false;
        if (strorgcode != null ? !strorgcode.equals(tItemcgRk.strorgcode) : tItemcgRk.strorgcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lngActivityId != null ? lngActivityId.hashCode() : 0;
        result = 31 * result + (lngReceiptNo != null ? lngReceiptNo.hashCode() : 0);
        result = 31 * result + (lngxhActivityId != null ? lngxhActivityId.hashCode() : 0);
        result = 31 * result + (intDirection != null ? intDirection.hashCode() : 0);
        result = 31 * result + (strplaymethod != null ? strplaymethod.hashCode() : 0);
        result = 31 * result + (strcustomercode != null ? strcustomercode.hashCode() : 0);
        result = 31 * result + (lngTollMaterialD != null ? lngTollMaterialD.hashCode() : 0);
        result = 31 * result + (strTollMaterialName != null ? strTollMaterialName.hashCode() : 0);
        result = 31 * result + (strTollMaterialStyle != null ? strTollMaterialStyle.hashCode() : 0);
        result = 31 * result + (strUnitName != null ? strUnitName.hashCode() : 0);
        result = 31 * result + (dblQuantity != null ? dblQuantity.hashCode() : 0);
        result = 31 * result + (dblPurchasePrice != null ? dblPurchasePrice.hashCode() : 0);
        result = 31 * result + (stremployeecode != null ? stremployeecode.hashCode() : 0);
        result = 31 * result + (strdepartmentcode != null ? strdepartmentcode.hashCode() : 0);
        result = 31 * result + (strPositionName != null ? strPositionName.hashCode() : 0);
        result = 31 * result + (strinvoicenumber != null ? strinvoicenumber.hashCode() : 0);
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
