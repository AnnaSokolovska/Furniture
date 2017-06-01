package com.example.demo.domain;

import javax.persistence.*;

/**
 * Created by Anna on 6/1/2017.
 */
@Entity
@Table(name = "sofa_has_completing", schema = "furniture", catalog = "")
@IdClass(SofaHasCompletingPK.class)
public class SofaHasCompleting {
    private int sofaIdSofa;
    private int completingIdCompleting;
    private Integer amount;

    @Id
    @Column(name = "Sofa_idSofa")
    public int getSofaIdSofa() {
        return sofaIdSofa;
    }

    public void setSofaIdSofa(int sofaIdSofa) {
        this.sofaIdSofa = sofaIdSofa;
    }

    @Id
    @Column(name = "Completing_idCompleting")
    public int getCompletingIdCompleting() {
        return completingIdCompleting;
    }

    public void setCompletingIdCompleting(int completingIdCompleting) {
        this.completingIdCompleting = completingIdCompleting;
    }

    @Basic
    @Column(name = "Amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SofaHasCompleting that = (SofaHasCompleting) o;

        if (sofaIdSofa != that.sofaIdSofa) return false;
        if (completingIdCompleting != that.completingIdCompleting) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sofaIdSofa;
        result = 31 * result + completingIdCompleting;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
