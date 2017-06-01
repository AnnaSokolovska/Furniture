package com.example.demo.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Anna on 6/1/2017.
 */
@Entity
@IdClass(SofaPK.class)
public class Sofa {
    private int idSofa;
    private String barCode;
    private String type;
    private Date date;
    private int orderIdOrder;
    private int employeeIdEmployee;
    private int projectIdProject;

    @Id
    @Column(name = "idSofa")
    public int getIdSofa() {
        return idSofa;
    }

    public void setIdSofa(int idSofa) {
        this.idSofa = idSofa;
    }

    @Basic
    @Column(name = "Bar Code")
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
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
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Id
    @Column(name = "Order_idOrder")
    public int getOrderIdOrder() {
        return orderIdOrder;
    }

    public void setOrderIdOrder(int orderIdOrder) {
        this.orderIdOrder = orderIdOrder;
    }

    @Basic
    @Column(name = "Employee_idEmployee")
    public int getEmployeeIdEmployee() {
        return employeeIdEmployee;
    }

    public void setEmployeeIdEmployee(int employeeIdEmployee) {
        this.employeeIdEmployee = employeeIdEmployee;
    }

    @Id
    @Column(name = "Project_idProject")
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

        Sofa sofa = (Sofa) o;

        if (idSofa != sofa.idSofa) return false;
        if (orderIdOrder != sofa.orderIdOrder) return false;
        if (employeeIdEmployee != sofa.employeeIdEmployee) return false;
        if (projectIdProject != sofa.projectIdProject) return false;
        if (barCode != null ? !barCode.equals(sofa.barCode) : sofa.barCode != null) return false;
        if (type != null ? !type.equals(sofa.type) : sofa.type != null) return false;
        if (date != null ? !date.equals(sofa.date) : sofa.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSofa;
        result = 31 * result + (barCode != null ? barCode.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + orderIdOrder;
        result = 31 * result + employeeIdEmployee;
        result = 31 * result + projectIdProject;
        return result;
    }
}
