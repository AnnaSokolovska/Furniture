package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Anna on 6/1/2017.
 */
public class OrderPK implements Serializable {
    private int idOrder;
    private int dealerIdDealer;

    @Column(name = "idOrder")
    @Id
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Column(name = "Dealer_idDealer")
    @Id
    public int getDealerIdDealer() {
        return dealerIdDealer;
    }

    public void setDealerIdDealer(int dealerIdDealer) {
        this.dealerIdDealer = dealerIdDealer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPK orderPK = (OrderPK) o;

        if (idOrder != orderPK.idOrder) return false;
        if (dealerIdDealer != orderPK.dealerIdDealer) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrder;
        result = 31 * result + dealerIdDealer;
        return result;
    }
}
