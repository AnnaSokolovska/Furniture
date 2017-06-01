package com.example.demo.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Anna on 6/1/2017.
 */
@Entity
public class Position {
    private int idPosition;
    private String title;

    @Id
    @Column(name = "idPosition")
    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    @Basic
    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (idPosition != position.idPosition) return false;
        if (title != null ? !title.equals(position.title) : position.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPosition;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}
