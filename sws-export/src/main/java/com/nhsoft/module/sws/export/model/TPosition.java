package com.nhsoft.module.sws.export.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 仓库–货位表(t_position)
 * */
@Entity
@Table(name = "t_position", schema = "dbo", catalog = "eabax")
public class TPosition  implements Serializable {

    @Id
    private String lngpositionlD;           //货位id          *
    private String strPositionCode;         //货位编码        *
    private String strPositionName;         //货位名称        *
    private String bytStatus;                //状态            *       0—未处理   1—已处理
    private Integer lngErppositionId;       //Erp 货位id


    @Column(name = "lngpositionlD")
    public String getLngpositionlD() {
        return lngpositionlD;
    }

    public void setLngpositionlD(String lngpositionlD) {
        this.lngpositionlD = lngpositionlD;
    }


    @Column(name = "strPositionCode")
    public String getStrPositionCode() {
        return strPositionCode;
    }

    public void setStrPositionCode(String strPositionCode) {
        this.strPositionCode = strPositionCode;
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


    @Column(name = "lngErppositionID")
    public Integer getLngErppositionId() {
        return lngErppositionId;
    }

    public void setLngErppositionId(Integer lngErppositionId) {
        this.lngErppositionId = lngErppositionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPosition tPosition = (TPosition) o;

        if (lngpositionlD != null ? !lngpositionlD.equals(tPosition.lngpositionlD) : tPosition.lngpositionlD != null)
            return false;
        if (strPositionCode != null ? !strPositionCode.equals(tPosition.strPositionCode) : tPosition.strPositionCode != null)
            return false;
        if (strPositionName != null ? !strPositionName.equals(tPosition.strPositionName) : tPosition.strPositionName != null)
            return false;
        if (bytStatus != null ? !bytStatus.equals(tPosition.bytStatus) : tPosition.bytStatus != null) return false;
        if (lngErppositionId != null ? !lngErppositionId.equals(tPosition.lngErppositionId) : tPosition.lngErppositionId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lngpositionlD != null ? lngpositionlD.hashCode() : 0;
        result = 31 * result + (strPositionCode != null ? strPositionCode.hashCode() : 0);
        result = 31 * result + (strPositionName != null ? strPositionName.hashCode() : 0);
        result = 31 * result + (bytStatus != null ? bytStatus.hashCode() : 0);
        result = 31 * result + (lngErppositionId != null ? lngErppositionId.hashCode() : 0);
        return result;
    }
}
