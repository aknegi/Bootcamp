package com.SpringJPA.SpringDataAccess.Entities;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
    private int age;

    public int getId() {return id;}

    public void setId(int id) { this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getLocation() {return location;}

    public void setLocation(String location) {this.location = location;}

    public int getAge() { return age;}

    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age ;
    }
}
