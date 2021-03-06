package com.spring.boot.section6.SecondSpringBoot.Employee;

import javax.validation.constraints.Size;

public class Employee {
    @Size(min = 2, message = "Name should have atleast 2 Characters")
    String name;
    int id;
    int age;

    public Employee(int id, String name, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
