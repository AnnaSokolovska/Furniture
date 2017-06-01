package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Anna on 6/1/2017.
 */
public class SofaPK implements Serializable {
    private int idSofa;
    private int orderIdOrder;
    private int projectIdProject;

    @Column(name = "idSofa")
    @Id
    public int getIdSofa() {
        return idSofa;
    }

    public void setIdSofa(int idSofa) {
        this.idSofa = idSofa;
    }

    @Column(name = "Order_idOrder")
    @Id
    public int getOrderIdOrder() {
        return orderIdOrder;
    }

    public void setOrderIdOrder(int orderIdOrder) {
        this.orderIdOrder = orderIdOrder;
    }

    @Column(name = "Project_idProject")
    @Id
    public int getProjectIdProject() {
        return projectIdProject;
    }

    public void setProjectIdProject(int projectIdProject) {
        this.projectIdProject = projectIdProject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SofaPK sofaPK = (SofaPK) o;

        if (idSofa != sofaPK.idSofa) return false;
        if (orderIdOrder != sofaPK.orderIdOrder) return false;
        if (projectIdProject != sofaPK.projectIdProject) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSofa;
        result = 31 * result + orderIdOrder;
        result = 31 * result + projectIdProject;
        return result;
    }
}
