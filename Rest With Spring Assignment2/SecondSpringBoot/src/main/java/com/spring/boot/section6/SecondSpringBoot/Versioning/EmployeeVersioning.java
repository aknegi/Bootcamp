package com.spring.boot.section6.SecondSpringBoot.Versioning;

import com.spring.boot.section6.SecondSpringBoot.Employee.Employee;
import com.spring.boot.section6.SecondSpringBoot.Employee.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(description = "Contains Different types of versioning in spring")
public class EmployeeVersioning {

    @Autowired
    EmployeeService service;

    //Header Versioning

    @GetMapping(value = "/employee/age", headers = "X-API-VERSION=1")
    @ApiOperation(value = " header version = 1",
            notes = "returns employees whose age is less than 18 and this request is done through Header")
    public List<Employee> ageLessThan18UsingHeader() {
        return service.employeesAgeLessThan18();
    }

    @GetMapping(value = "/employee/age", headers = "X-API-VERSION=2")
    @ApiOperation(value = " header version = 2",
            notes = "returns employees whose age is equal to and more than 18 and this request is done through Header")
    public List<Employee> ageMoreThan17UsingHeader() {
        return service.employeesAgeMoreThan17();
    }


    //Parameter Versioning
    @GetMapping(value = "/employee/age", params = "version=1")
    @ApiOperation(value = " parameter version = 1",
            notes = " it takes the version from the parameter and returns employees whose age is less than 18")
    public List<Employee> ageLessThan18UsingParam() {
        return service.employeesAgeLessThan18();
    }

    @GetMapping(value = "/employee/age", params = "version=2")
    @ApiOperation(value = " parameter version = 2",
            notes = " it takes the version from the parameter and returns employees whose age is equal to and more than 18")
    public List<Employee> ageMoreThan17UsingParam() {
        return service.employeesAgeMoreThan17();
    }

    // Produces Versioning
    @GetMapping(value = "/employee/age", produces = "application/v1+json")
    @ApiOperation(value = " produces version = 1",
            notes = " it takes the version from the produces and returns employees whose age is less than 18")
    public List<Employee> ageLessThan18UsingProduces() {
        return service.employeesAgeLessThan18();
    }

    @GetMapping(value = "/employee/age", produces = "application/v2+json")
    @ApiOperation(value = " produces version = 2",
            notes = " it takes the version from the produces and returns employees whose age is equal to and more than 18")
    public List<Employee> ageMoreThan17UsingProduces() {
        return service.employeesAgeMoreThan17();
    }


    //URI Versioning
    @GetMapping(value = "/employee/age/v1")
    @ApiOperation(value = " Uri version = 1",
            notes = " it takes the version from the URI and returns employees whose age is less than 18")
    public List<Employee> ageLessThan18UsingURI() {
        return service.employeesAgeLessThan18();
    }

    @GetMapping(value = "/employee/age/v2")
    @ApiOperation(value = " Uri version = 2",
            notes = "  it takes the version from the URI and returns employees whose age is equal to and more than 18")
    public List<Employee> ageMoreThan17UsingURI() {
        return service.employeesAgeMoreThan17();
    }


}

