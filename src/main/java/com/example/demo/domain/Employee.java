package com.example.demo.domain;

import javax.persistence.*;

/**
 * Created by Anna on 6/1/2017.
 */
@Entity
@IdClass(EmployeePK.class)
public class Employee {
    private int idEmployee;
    private String name;
    private String middleName;
    private String surname;
    private int positionIdPosition;

    @Id
    @Column(name = "idEmployee")
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "middlename")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Id
    @Column(name = "position_id_position")
    public int getPositionIdPosition() {
        return positionIdPosition;
    }

    public void setPositionIdPosition(int positionIdPosition) {
        this.positionIdPosition = positionIdPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (idEmployee != employee.idEmployee) return false;
        if (positionIdPosition != employee.positionIdPosition) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (middleName != null ? !middleName.equals(employee.middleName) : employee.middleName != null) return false;
        if (surname != null ? !surname.equals(employee.surname) : employee.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEmployee;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + positionIdPosition;
        return result;
    }
}
