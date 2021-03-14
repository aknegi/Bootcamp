package com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.JoiningStrategy;

import javax.persistence.*;

@Entity
@Table(name="joining_employee")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class EmployeeForJoiningStrategy {
    @Id
    @Column(name = "emp_id")
    private int Id;
    @Column(name = "emp_name")
    private String empName;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
