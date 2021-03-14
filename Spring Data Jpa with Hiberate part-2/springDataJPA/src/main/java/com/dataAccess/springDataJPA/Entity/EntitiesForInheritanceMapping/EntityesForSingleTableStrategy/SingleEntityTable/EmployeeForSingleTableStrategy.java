package com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.EntityesForSingleTableStrategy.SingleEntityTable;

import javax.persistence.*;

@Entity
@Table(name = "employee_for_single_table_inheritance")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "employment_type", discriminatorType = DiscriminatorType.STRING)
public class EmployeeForSingleTableStrategy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
