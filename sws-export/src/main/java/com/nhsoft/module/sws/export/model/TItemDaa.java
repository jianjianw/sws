package com.nhsoft.module.sws.export.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
/**
 * 组合拆分–组装拆卸单	(t_itemDAA)
 * */
@Entity
@Table(name = "t_itemDAA", schema = "dbo", catalog = "eabax")
public class TItemDaa implements Serializable{

    @Id
    private String lngActivityId;                       //业务ID
    @Id
    private String lngReceiptNo;                        //单据号
    @Id
    private String lngxhActivityId;                     //序号
    private String intDirection;                        //审批及作废标志
    private String strcustomercode;                     //采购单位
    private String stremployeecode;                     //员工名称
    private String strdepartmentcode;                   //部门名称
    private String lngTollMaterialD;                    //物资ID
    private String strTollMaterialName;                 //材料名称
    private String strTollMaterialStyle;                //材料规格
    private String strUnitName;                          //计量单位
    private BigDecimal dblQuantity;                    //数量
    private BigDecimal dblPurchasePrice;              //采购价格
    private String strPositionName;                     //货位名称
    private String bytStatus;                            //处理标志         入库 0—未处理 1--已处理
    private String bytStatus1;                           //处理标志         出库 0—未处理 1--已处理
    private Date strDate;                                //写入时间
    private Date strLastDate;                            //回写时间
    private Integer lngErpActivityId;                   //eRP回写主表
    private String isnotposition;                        //货位是否存在
    private String isnotunit;                            //计量单位是否存在
    private String strorgcode;                           //机构


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


    @Column(name = "strcustomercode")
    public String getStrcustomercode() {
        return strcustomercode;
    }

    public void setStrcustomercode(String strcustomercode) {
        this.strcustomercode = strcustomercode;
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


    @Column(name = "bytStatus1")
    public String getBytStatus1() {
        return bytStatus1;
    }

    public void setBytStatus1(String bytStatus1) {
        this.bytStatus1 = bytStatus1;
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

        TItemDaa tItemDaa = (TItemDaa) o;

        if (lngActivityId != null ? !lngActivityId.equals(tItemDaa.lngActivityId) : tItemDaa.lngActivityId != null)
            return false;
        if (lngReceiptNo != null ? !lngReceiptNo.equals(tItemDaa.lngReceiptNo) : tItemDaa.lngReceiptNo != null)
            return false;
        if (lngxhActivityId != null ? !lngxhActivityId.equals(tItemDaa.lngxhActivityId) : tItemDaa.lngxhActivityId != null)
            return false;
        if (intDirection != null ? !intDirection.equals(tItemDaa.intDirection) : tItemDaa.intDirection != null)
            return false;
        if (strcustomercode != null ? !strcustomercode.equals(tItemDaa.strcustomercode) : tItemDaa.strcustomercode != null)
            return false;
        if (stremployeecode != null ? !stremployeecode.equals(tItemDaa.stremployeecode) : tItemDaa.stremployeecode != null)
            return false;
        if (strdepartmentcode != null ? !strdepartmentcode.equals(tItemDaa.strdepartmentcode) : tItemDaa.strdepartmentcode != null)
            return false;
        if (lngTollMaterialD != null ? !lngTollMaterialD.equals(tItemDaa.lngTollMaterialD) : tItemDaa.lngTollMaterialD != null)
            return false;
        if (strTollMaterialName != null ? !strTollMaterialName.equals(tItemDaa.strTollMaterialName) : tItemDaa.strTollMaterialName != null)
            return false;
        if (strTollMaterialStyle != null ? !strTollMaterialStyle.equals(tItemDaa.strTollMaterialStyle) : tItemDaa.strTollMaterialStyle != null)
            return false;
        if (strUnitName != null ? !strUnitName.equals(tItemDaa.strUnitName) : tItemDaa.strUnitName != null)
            return false;
        if (dblQuantity != null ? !dblQuantity.equals(tItemDaa.dblQuantity) : tItemDaa.dblQuantity != null)
            return false;
        if (dblPurchasePrice != null ? !dblPurchasePrice.equals(tItemDaa.dblPurchasePrice) : tItemDaa.dblPurchasePrice != null)
            return false;
        if (strPositionName != null ? !strPositionName.equals(tItemDaa.strPositionName) : tItemDaa.strPositionName != null)
            return false;
        if (bytStatus != null ? !bytStatus.equals(tItemDaa.bytStatus) : tItemDaa.bytStatus != null) return false;
        if (bytStatus1 != null ? !bytStatus1.equals(tItemDaa.bytStatus1) : tItemDaa.bytStatus1 != null) return false;
        if (strDate != null ? !strDate.equals(tItemDaa.strDate) : tItemDaa.strDate != null) return false;
        if (strLastDate != null ? !strLastDate.equals(tItemDaa.strLastDate) : tItemDaa.strLastDate != null)
            return false;
        if (lngErpActivityId != null ? !lngErpActivityId.equals(tItemDaa.lngErpActivityId) : tItemDaa.lngErpActivityId != null)
            return false;
        if (isnotposition != null ? !isnotposition.equals(tItemDaa.isnotposition) : tItemDaa.isnotposition != null)
            return false;
        if (isnotunit != null ? !isnotunit.equals(tItemDaa.isnotunit) : tItemDaa.isnotunit != null) return false;
        if (strorgcode != null ? !strorgcode.equals(tItemDaa.strorgcode) : tItemDaa.strorgcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lngActivityId != null ? lngActivityId.hashCode() : 0;
        result = 31 * result + (lngReceiptNo != null ? lngReceiptNo.hashCode() : 0);
        result = 31 * result + (lngxhActivityId != null ? lngxhActivityId.hashCode() : 0);
        result = 31 * result + (intDirection != null ? intDirection.hashCode() : 0);
        result = 31 * result + (strcustomercode != null ? strcustomercode.hashCode() : 0);
        result = 31 * result + (stremployeecode != null ? stremployeecode.hashCode() : 0);
        result = 31 * result + (strdepartmentcode != null ? strdepartmentcode.hashCode() : 0);
        result = 31 * result + (lngTollMaterialD != null ? lngTollMaterialD.hashCode() : 0);
        result = 31 * result + (strTollMaterialName != null ? strTollMaterialName.hashCode() : 0);
        result = 31 * result + (strTollMaterialStyle != null ? strTollMaterialStyle.hashCode() : 0);
        result = 31 * result + (strUnitName != null ? strUnitName.hashCode() : 0);
        result = 31 * result + (dblQuantity != null ? dblQuantity.hashCode() : 0);
        result = 31 * result + (dblPurchasePrice != null ? dblPurchasePrice.hashCode() : 0);
        result = 31 * result + (strPositionName != null ? strPositionName.hashCode() : 0);
        result = 31 * result + (bytStatus != null ? bytStatus.hashCode() : 0);
        result = 31 * result + (bytStatus1 != null ? bytStatus1.hashCode() : 0);
        result = 31 * result + (strDate != null ? strDate.hashCode() : 0);
        result = 31 * result + (strLastDate != null ? strLastDate.hashCode() : 0);
        result = 31 * result + (lngErpActivityId != null ? lngErpActivityId.hashCode() : 0);
        result = 31 * result + (isnotposition != null ? isnotposition.hashCode() : 0);
        result = 31 * result + (isnotunit != null ? isnotunit.hashCode() : 0);
        result = 31 * result + (strorgcode != null ? strorgcode.hashCode() : 0);
        return result;
    }
}
