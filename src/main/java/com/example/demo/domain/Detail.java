package com.example.demo.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Anna on 6/1/2017.
 */
@Entity
public class Detail {
    private int idDetail;
    private String material;
    private String type;
    private String characteristic;

    @Id
    @Column(name = "idDetail")
    public int getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    @Basic
    @Column(name = "Material")
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Basic
    @Column(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "Characteristic")
    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Detail detail = (Detail) o;

        if (idDetail != detail.idDetail) return false;
        if (material != null ? !material.equals(detail.material) : detail.material != null) return false;
        if (type != null ? !type.equals(detail.type) : detail.type != null) return false;
        if (characteristic != null ? !characteristic.equals(detail.characteristic) : detail.characteristic != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDetail;
        result = 31 * result + (material != null ? material.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (characteristic != null ? characteristic.hashCode() : 0);
        return result;
    }
}
