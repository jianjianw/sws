package com.nhsoft.module.sws.export.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * 商品类别–类别(t_type)
 * */
@Entity
@Table(name = "t_type", schema = "dbo", catalog = "eabax")
public class TType implements Serializable {

    @Id
    private String lngtypelD;
    private String strtypeCode;             //类别编码
    private String strtypeName;             //类别名称
    private String bytStatus;               //状态            0-新增        1-已处理
    private String lngErptypeId;            //erpID


    @Column(name = "lngtypelD")
    public String getLngtypelD() {
        return lngtypelD;
    }

    public void setLngtypelD(String lngtypelD) {
        this.lngtypelD = lngtypelD;
    }


    @Column(name = "strtypeCode")
    public String getStrtypeCode() {
        return strtypeCode;
    }

    public void setStrtypeCode(String strtypeCode) {
        this.strtypeCode = strtypeCode;
    }


    @Column(name = "strtypeName")
    public String getStrtypeName() {
        return strtypeName;
    }

    public void setStrtypeName(String strtypeName) {
        this.strtypeName = strtypeName;
    }


    @Column(name = "bytStatus")
    public String getBytStatus() {
        return bytStatus;
    }

    public void setBytStatus(String bytStatus) {
        this.bytStatus = bytStatus;
    }


    @Column(name = "lngErptypeID")
    public String getLngErptypeId() {
        return lngErptypeId;
    }

    public void setLngErptypeId(String lngErptypeId) {
        this.lngErptypeId = lngErptypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TType tType = (TType) o;

        if (lngtypelD != null ? !lngtypelD.equals(tType.lngtypelD) : tType.lngtypelD != null) return false;
        if (strtypeCode != null ? !strtypeCode.equals(tType.strtypeCode) : tType.strtypeCode != null) return false;
        if (strtypeName != null ? !strtypeName.equals(tType.strtypeName) : tType.strtypeName != null) return false;
        if (bytStatus != null ? !bytStatus.equals(tType.bytStatus) : tType.bytStatus != null) return false;
        if (lngErptypeId != null ? !lngErptypeId.equals(tType.lngErptypeId) : tType.lngErptypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lngtypelD != null ? lngtypelD.hashCode() : 0;
        result = 31 * result + (strtypeCode != null ? strtypeCode.hashCode() : 0);
        result = 31 * result + (strtypeName != null ? strtypeName.hashCode() : 0);
        result = 31 * result + (bytStatus != null ? bytStatus.hashCode() : 0);
        result = 31 * result + (lngErptypeId != null ? lngErptypeId.hashCode() : 0);
        return result;
    }
}
