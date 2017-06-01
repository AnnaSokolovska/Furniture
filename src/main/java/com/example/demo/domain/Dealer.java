package com.example.demo.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Anna on 6/1/2017.
 */
@Entity
public class Dealer {
    private int idDealer;
    private String title;
    private String address;
    private Integer phone;
    private int currentAccount;

    @Id
    @Column(name = "idDealer")
    public int getIdDealer() {
        return idDealer;
    }

    public void setIdDealer(int idDealer) {
        this.idDealer = idDealer;
    }

    @Basic
    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Phone")
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "Current Account")
    public int getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(int currentAccount) {
        this.currentAccount = currentAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dealer dealer = (Dealer) o;

        if (idDealer != dealer.idDealer) return false;
        if (currentAccount != dealer.currentAccount) return false;
        if (title != null ? !title.equals(dealer.title) : dealer.title != null) return false;
        if (address != null ? !address.equals(dealer.address) : dealer.address != null) return false;
        if (phone != null ? !phone.equals(dealer.phone) : dealer.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDealer;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + currentAccount;
        return result;
    }
}
