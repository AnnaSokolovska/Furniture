package com.example.demo.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Anna on 6/1/2017.
 */
@Entity
@IdClass(CompletingPK.class)
public class Completing {
    private int idCompleting;
    private Double price;
    private String producer;
    private Date date;
    private Date operationalLifetime;
    private int detailIdDetail;

    @Id
    @Column(name = "idCompleting")
    public int getIdCompleting() {
        return idCompleting;
    }

    public void setIdCompleting(int idCompleting) {
        this.idCompleting = idCompleting;
    }

    @Basic
    @Column(name = "Price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "Producer")
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Basic
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "Operational Lifetime")
    public Date getOperationalLifetime() {
        return operationalLifetime;
    }

    public void setOperationalLifetime(Date operationalLifetime) {
        this.operationalLifetime = operationalLifetime;
    }

    @Id
    @Column(name = "Detail_idDetail")
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

        Completing that = (Completing) o;

        if (idCompleting != that.idCompleting) return false;
        if (detailIdDetail != that.detailIdDetail) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (producer != null ? !producer.equals(that.producer) : that.producer != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (operationalLifetime != null ? !operationalLifetime.equals(that.operationalLifetime) : that.operationalLifetime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCompleting;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (operationalLifetime != null ? operationalLifetime.hashCode() : 0);
        result = 31 * result + detailIdDetail;
        return result;
    }
}
