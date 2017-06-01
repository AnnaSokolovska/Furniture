package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Anna on 6/1/2017.
 */
public class SofaHasCompletingPK implements Serializable {
    private int sofaIdSofa;
    private int completingIdCompleting;

    @Column(name = "Sofa_idSofa")
    @Id
    public int getSofaIdSofa() {
        return sofaIdSofa;
    }

    public void setSofaIdSofa(int sofaIdSofa) {
        this.sofaIdSofa = sofaIdSofa;
    }

    @Column(name = "Completing_idCompleting")
    @Id
    public int getCompletingIdCompleting() {
        return completingIdCompleting;
    }

    public void setCompletingIdCompleting(int completingIdCompleting) {
        this.completingIdCompleting = completingIdCompleting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SofaHasCompletingPK that = (SofaHasCompletingPK) o;

        if (sofaIdSofa != that.sofaIdSofa) return false;
        if (completingIdCompleting != that.completingIdCompleting) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sofaIdSofa;
        result = 31 * result + completingIdCompleting;
        return result;
    }
}
