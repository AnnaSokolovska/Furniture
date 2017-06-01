package com.example.demo.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Anna on 6/1/2017.
 */
@Entity
@IdClass(ProjectPK.class)
public class Project {
    private int idProject;
    private Date date;
    private String drawing;
    private int employeeIdEmployee;

    @Id
    @Column(name = "idProject")
    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    @Basic
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "Drawing")
    public String getDrawing() {
        return drawing;
    }

    public void setDrawing(String drawing) {
        this.drawing = drawing;
    }

    @Id
    @Column(name = "Employee_idEmployee")
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

        Project project = (Project) o;

        if (idProject != project.idProject) return false;
        if (employeeIdEmployee != project.employeeIdEmployee) return false;
        if (date != null ? !date.equals(project.date) : project.date != null) return false;
        if (drawing != null ? !drawing.equals(project.drawing) : project.drawing != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProject;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (drawing != null ? drawing.hashCode() : 0);
        result = 31 * result + employeeIdEmployee;
        return result;
    }
}
