package com.nhsoft.module.sws.export.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品档案–物品中间表(t_TollMaterial)
 * */
@Entity
@Table(name = "t_TollMaterial", schema = "dbo", catalog = "eabax")
public class TTollMaterial implements Serializable {


    @Id
    private String lngTollMaterialD;                //材料id
    private String strTollMaterialCode;             //材料编码                  必填
    private String strTollMaterialName;             //材料名称                  必填
    private String strTollMaterialStyle;            //材料规格
    private String strUnitName;                      //计量单位（基本）           必填
    private String dblFactor;                        //换算关系(基本与库存)
    private BigDecimal dblPurchasePrice;          //采购价格
    private BigDecimal dblSalePrice;              //销售价格
    private BigDecimal dblMinUnitsInStock;        //最低库存
    private BigDecimal dblMaxUnitsInStock;        //最高库存
    private String strSystemName;                   //新希望系统名称
    private String strItemNatureName;               //物资性质
    private String strItemtypeName;                 //物资类别                   必填
    private BigDecimal taxrate;                    //税率                       必填
    private String bytStatus;                        //记录状态                   必填
    private Date strDate;                            //写入时间                   新希望方的写入的时间 YYYY-MM-DD HH:MM:SS
    private Date strLastDate;                        //回写时间
    private String lngErpMedicineId;                //回写ID
    private String strCustom1;
    private String strCustom2;
    private String strCustom3;
    private String strCustom4;
    private String strCustom5;
    private String strCustom6;
    private String strCustom7;
    private String strCustom8;
    private String strCustom9;
    private String strCustom10;
    private String strorgname;                      //来自哪个机构


    @Column(name = "lngTollMaterialD")
    public String getLngTollMaterialD() {
        return lngTollMaterialD;
    }

    public void setLngTollMaterialD(String lngTollMaterialD) {
        this.lngTollMaterialD = lngTollMaterialD;
    }


    @Column(name = "strTollMaterialCode")
    public String getStrTollMaterialCode() {
        return strTollMaterialCode;
    }

    public void setStrTollMaterialCode(String strTollMaterialCode) {
        this.strTollMaterialCode = strTollMaterialCode;
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


    @Column(name = "dblFactor")
    public String getDblFactor() {
        return dblFactor;
    }

    public void setDblFactor(String dblFactor) {
        this.dblFactor = dblFactor;
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


    @Column(name = "dblMinUnitsInStock")
    public BigDecimal getDblMinUnitsInStock() {
        return dblMinUnitsInStock;
    }

    public void setDblMinUnitsInStock(BigDecimal dblMinUnitsInStock) {
        this.dblMinUnitsInStock = dblMinUnitsInStock;
    }


    @Column(name = "dblMaxUnitsInStock")
    public BigDecimal getDblMaxUnitsInStock() {
        return dblMaxUnitsInStock;
    }

    public void setDblMaxUnitsInStock(BigDecimal dblMaxUnitsInStock) {
        this.dblMaxUnitsInStock = dblMaxUnitsInStock;
    }


    @Column(name = "strSystemName")
    public String getStrSystemName() {
        return strSystemName;
    }

    public void setStrSystemName(String strSystemName) {
        this.strSystemName = strSystemName;
    }


    @Column(name = "strItemNatureName")
    public String getStrItemNatureName() {
        return strItemNatureName;
    }

    public void setStrItemNatureName(String strItemNatureName) {
        this.strItemNatureName = strItemNatureName;
    }


    @Column(name = "strItemtypeName")
    public String getStrItemtypeName() {
        return strItemtypeName;
    }

    public void setStrItemtypeName(String strItemtypeName) {
        this.strItemtypeName = strItemtypeName;
    }


    @Column(name = "taxrate")
    public BigDecimal getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(BigDecimal taxrate) {
        this.taxrate = taxrate;
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


    @Column(name = "lngErpMedicineID")
    public String getLngErpMedicineId() {
        return lngErpMedicineId;
    }

    public void setLngErpMedicineId(String lngErpMedicineId) {
        this.lngErpMedicineId = lngErpMedicineId;
    }


    @Column(name = "strCustom1")
    public String getStrCustom1() {
        return strCustom1;
    }

    public void setStrCustom1(String strCustom1) {
        this.strCustom1 = strCustom1;
    }


    @Column(name = "strCustom2")
    public String getStrCustom2() {
        return strCustom2;
    }

    public void setStrCustom2(String strCustom2) {
        this.strCustom2 = strCustom2;
    }


    @Column(name = "strCustom3")
    public String getStrCustom3() {
        return strCustom3;
    }

    public void setStrCustom3(String strCustom3) {
        this.strCustom3 = strCustom3;
    }


    @Column(name = "strCustom4")
    public String getStrCustom4() {
        return strCustom4;
    }

    public void setStrCustom4(String strCustom4) {
        this.strCustom4 = strCustom4;
    }


    @Column(name = "strCustom5")
    public String getStrCustom5() {
        return strCustom5;
    }

    public void setStrCustom5(String strCustom5) {
        this.strCustom5 = strCustom5;
    }


    @Column(name = "strCustom6")
    public String getStrCustom6() {
        return strCustom6;
    }

    public void setStrCustom6(String strCustom6) {
        this.strCustom6 = strCustom6;
    }


    @Column(name = "strCustom7")
    public String getStrCustom7() {
        return strCustom7;
    }

    public void setStrCustom7(String strCustom7) {
        this.strCustom7 = strCustom7;
    }


    @Column(name = "strCustom8")
    public String getStrCustom8() {
        return strCustom8;
    }

    public void setStrCustom8(String strCustom8) {
        this.strCustom8 = strCustom8;
    }


    @Column(name = "strCustom9")
    public String getStrCustom9() {
        return strCustom9;
    }

    public void setStrCustom9(String strCustom9) {
        this.strCustom9 = strCustom9;
    }


    @Column(name = "strCustom10")
    public String getStrCustom10() {
        return strCustom10;
    }

    public void setStrCustom10(String strCustom10) {
        this.strCustom10 = strCustom10;
    }


    @Column(name = "Strorgname")
    public String getStrorgname() {
        return strorgname;
    }

    public void setStrorgname(String strorgname) {
        this.strorgname = strorgname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTollMaterial that = (TTollMaterial) o;

        if (lngTollMaterialD != null ? !lngTollMaterialD.equals(that.lngTollMaterialD) : that.lngTollMaterialD != null)
            return false;
        if (strTollMaterialCode != null ? !strTollMaterialCode.equals(that.strTollMaterialCode) : that.strTollMaterialCode != null)
            return false;
        if (strTollMaterialName != null ? !strTollMaterialName.equals(that.strTollMaterialName) : that.strTollMaterialName != null)
            return false;
        if (strTollMaterialStyle != null ? !strTollMaterialStyle.equals(that.strTollMaterialStyle) : that.strTollMaterialStyle != null)
            return false;
        if (strUnitName != null ? !strUnitName.equals(that.strUnitName) : that.strUnitName != null) return false;
        if (dblFactor != null ? !dblFactor.equals(that.dblFactor) : that.dblFactor != null) return false;
        if (dblPurchasePrice != null ? !dblPurchasePrice.equals(that.dblPurchasePrice) : that.dblPurchasePrice != null)
            return false;
        if (dblSalePrice != null ? !dblSalePrice.equals(that.dblSalePrice) : that.dblSalePrice != null) return false;
        if (dblMinUnitsInStock != null ? !dblMinUnitsInStock.equals(that.dblMinUnitsInStock) : that.dblMinUnitsInStock != null)
            return false;
        if (dblMaxUnitsInStock != null ? !dblMaxUnitsInStock.equals(that.dblMaxUnitsInStock) : that.dblMaxUnitsInStock != null)
            return false;
        if (strSystemName != null ? !strSystemName.equals(that.strSystemName) : that.strSystemName != null)
            return false;
        if (strItemNatureName != null ? !strItemNatureName.equals(that.strItemNatureName) : that.strItemNatureName != null)
            return false;
        if (strItemtypeName != null ? !strItemtypeName.equals(that.strItemtypeName) : that.strItemtypeName != null)
            return false;
        if (taxrate != null ? !taxrate.equals(that.taxrate) : that.taxrate != null) return false;
        if (bytStatus != null ? !bytStatus.equals(that.bytStatus) : that.bytStatus != null) return false;
        if (strDate != null ? !strDate.equals(that.strDate) : that.strDate != null) return false;
        if (strLastDate != null ? !strLastDate.equals(that.strLastDate) : that.strLastDate != null) return false;
        if (lngErpMedicineId != null ? !lngErpMedicineId.equals(that.lngErpMedicineId) : that.lngErpMedicineId != null)
            return false;
        if (strCustom1 != null ? !strCustom1.equals(that.strCustom1) : that.strCustom1 != null) return false;
        if (strCustom2 != null ? !strCustom2.equals(that.strCustom2) : that.strCustom2 != null) return false;
        if (strCustom3 != null ? !strCustom3.equals(that.strCustom3) : that.strCustom3 != null) return false;
        if (strCustom4 != null ? !strCustom4.equals(that.strCustom4) : that.strCustom4 != null) return false;
        if (strCustom5 != null ? !strCustom5.equals(that.strCustom5) : that.strCustom5 != null) return false;
        if (strCustom6 != null ? !strCustom6.equals(that.strCustom6) : that.strCustom6 != null) return false;
        if (strCustom7 != null ? !strCustom7.equals(that.strCustom7) : that.strCustom7 != null) return false;
        if (strCustom8 != null ? !strCustom8.equals(that.strCustom8) : that.strCustom8 != null) return false;
        if (strCustom9 != null ? !strCustom9.equals(that.strCustom9) : that.strCustom9 != null) return false;
        if (strCustom10 != null ? !strCustom10.equals(that.strCustom10) : that.strCustom10 != null) return false;
        if (strorgname != null ? !strorgname.equals(that.strorgname) : that.strorgname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lngTollMaterialD != null ? lngTollMaterialD.hashCode() : 0;
        result = 31 * result + (strTollMaterialCode != null ? strTollMaterialCode.hashCode() : 0);
        result = 31 * result + (strTollMaterialName != null ? strTollMaterialName.hashCode() : 0);
        result = 31 * result + (strTollMaterialStyle != null ? strTollMaterialStyle.hashCode() : 0);
        result = 31 * result + (strUnitName != null ? strUnitName.hashCode() : 0);
        result = 31 * result + (dblFactor != null ? dblFactor.hashCode() : 0);
        result = 31 * result + (dblPurchasePrice != null ? dblPurchasePrice.hashCode() : 0);
        result = 31 * result + (dblSalePrice != null ? dblSalePrice.hashCode() : 0);
        result = 31 * result + (dblMinUnitsInStock != null ? dblMinUnitsInStock.hashCode() : 0);
        result = 31 * result + (dblMaxUnitsInStock != null ? dblMaxUnitsInStock.hashCode() : 0);
        result = 31 * result + (strSystemName != null ? strSystemName.hashCode() : 0);
        result = 31 * result + (strItemNatureName != null ? strItemNatureName.hashCode() : 0);
        result = 31 * result + (strItemtypeName != null ? strItemtypeName.hashCode() : 0);
        result = 31 * result + (taxrate != null ? taxrate.hashCode() : 0);
        result = 31 * result + (bytStatus != null ? bytStatus.hashCode() : 0);
        result = 31 * result + (strDate != null ? strDate.hashCode() : 0);
        result = 31 * result + (strLastDate != null ? strLastDate.hashCode() : 0);
        result = 31 * result + (lngErpMedicineId != null ? lngErpMedicineId.hashCode() : 0);
        result = 31 * result + (strCustom1 != null ? strCustom1.hashCode() : 0);
        result = 31 * result + (strCustom2 != null ? strCustom2.hashCode() : 0);
        result = 31 * result + (strCustom3 != null ? strCustom3.hashCode() : 0);
        result = 31 * result + (strCustom4 != null ? strCustom4.hashCode() : 0);
        result = 31 * result + (strCustom5 != null ? strCustom5.hashCode() : 0);
        result = 31 * result + (strCustom6 != null ? strCustom6.hashCode() : 0);
        result = 31 * result + (strCustom7 != null ? strCustom7.hashCode() : 0);
        result = 31 * result + (strCustom8 != null ? strCustom8.hashCode() : 0);
        result = 31 * result + (strCustom9 != null ? strCustom9.hashCode() : 0);
        result = 31 * result + (strCustom10 != null ? strCustom10.hashCode() : 0);
        result = 31 * result + (strorgname != null ? strorgname.hashCode() : 0);
        return result;
    }
}
