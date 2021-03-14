package com.dataAccess.springDataJPA.Entity.EntitiesForComponentMapping;

import javax.persistence.*;

@Entity
@Table(name = "salaried_employee_table")
public class EmployeeForComponentMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int id;
    @Column(name = "emp_first_name")
    private String firstName;
    @Column(name = "emp_last_name")
    private String lastName;
    @Column(name = "emp_age")
    private int age;
    @Embedded
    private Salary salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
