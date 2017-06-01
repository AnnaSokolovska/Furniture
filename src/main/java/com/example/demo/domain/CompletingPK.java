package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Anna on 6/1/2017.
 */
public class CompletingPK implements Serializable {
    private int idCompleting;
    private int detailIdDetail;

    @Column(name = "idCompleting")
    @Id
    public int getIdCompleting() {
        return idCompleting;
    }

    public void setIdCompleting(int idCompleting) {
        this.idCompleting = idCompleting;
    }

    @Column(name = "Detail_idDetail")
    @Id
    public int getDetailIdDetail() {
        return detailIdDetail;
    }

    public void setDetailIdDetail(int detailIdDetail) {
        this.detailIdDetail = detailIdDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompletingPK that = (CompletingPK) o;

        if (idCompleting != that.idCompleting) return false;
        if (detailIdDetail != that.detailIdDetail) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCompleting;
        result = 31 * result + detailIdDetail;
        return result;
    }
}
