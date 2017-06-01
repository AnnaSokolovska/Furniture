package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Anna on 6/1/2017.
 */
public class EmployeePK implements Serializable {
    private int idEmployee;
    private int positionIdPosition;

    @Column(name = "idEmployee")
    @Id
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Column(name = "Position_idPosition")
    @Id
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

        EmployeePK that = (EmployeePK) o;

        if (idEmployee != that.idEmployee) return false;
        if (positionIdPosition != that.positionIdPosition) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEmployee;
        result = 31 * result + positionIdPosition;
        return result;
    }
}
