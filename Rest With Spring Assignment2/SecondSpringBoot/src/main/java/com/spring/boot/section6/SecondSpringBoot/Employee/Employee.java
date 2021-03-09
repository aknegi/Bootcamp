package com.spring.boot.section6.SecondSpringBoot.Employee;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;

//@JsonFilter("EmployeeFilter") // uncomment for dynamic filtering
@ApiModel(description = " Contains all details about Employee")
public class Employee {
    @ApiModelProperty(notes = "Name should have atleast 2 Characters")
    @Size(min = 2, message = "Name should have atleast 2 Characters")
    String name;

    // @JsonIgnore  //uncomment for static filtering
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
