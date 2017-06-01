package com.example.demo.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Anna on 6/1/2017.
 */
@Entity
@IdClass(OrderPK.class)
public class Order {
    private int idOrder;
    private Date orderDate;
    private Date executionDate;
    private Double cost;
    private int dealerIdDealer;

    @Id
    @Column(name = "idOrder")
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "Order Date")
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "Execution Date")
    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    @Basic
    @Column(name = "Cost")
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Id
    @Column(name = "Dealer_idDealer")
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

        Order order = (Order) o;

        if (idOrder != order.idOrder) return false;
        if (dealerIdDealer != order.dealerIdDealer) return false;
        if (orderDate != null ? !orderDate.equals(order.orderDate) : order.orderDate != null) return false;
        if (executionDate != null ? !executionDate.equals(order.executionDate) : order.executionDate != null)
            return false;
        if (cost != null ? !cost.equals(order.cost) : order.cost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrder;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (executionDate != null ? executionDate.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + dealerIdDealer;
        return result;
    }
}
