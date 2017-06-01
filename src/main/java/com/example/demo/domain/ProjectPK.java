package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Anna on 6/1/2017.
 */
public class ProjectPK implements Serializable {
    private int idProject;
    private int employeeIdEmployee;

    @Column(name = "idProject")
    @Id
    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    @Column(name = "Employee_idEmployee")
    @Id
    public int getEmployeeIdEmployee() {
        return employeeIdEmployee;
    }

    public void setEmployeeIdEmployee(int employeeIdEmployee) {
        this.employeeIdEmployee = employeeIdEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectPK projectPK = (ProjectPK) o;

        if (idProject != projectPK.idProject) return false;
        if (employeeIdEmployee != projectPK.employeeIdEmployee) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProject;
        result = 31 * result + employeeIdEmployee;
        return result;
    }
}
