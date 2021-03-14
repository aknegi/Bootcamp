package com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.TableStrategy;

import javax.persistence.*;

@Entity
@Table(name = "employee_for_table_inheritance")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class EmployeeForTableStrategy {
    @Id
    @Column(name = "emp_id")
    private int Id;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_salary")
    private int Salary;

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

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
