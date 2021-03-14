package com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.JoiningStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employee_permanent")
@PrimaryKeyJoinColumn(name = "emp_id")
public class EmployeePermanent extends  EmployeeForJoiningStrategy{
    @Column(name = "emp_id")
    private int Id;
    @Column(name = "permanent_id")
    private String permanentId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPermanentId() {
        return permanentId;
    }

    public void setPermanentId(String permanentId) {
        this.permanentId = permanentId;
    }
}
