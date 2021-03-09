package com.spring.boot.section6.SecondSpringBoot.Employee;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import com.spring.boot.section6.SecondSpringBoot.Exceptions.EmployeeNotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@Api(description = "Contains all the Controllers of Employee services")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // controller Print Welcome Message

    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Welcome to spring boot.";
    }

    // Controller Retrieve all Employees

    @GetMapping("/employees")
    @ApiOperation(value = "Return all the Employees present.",
            notes = "On the get request this will return the List of emplyees.",
            response = Employee.class)
    public List<Employee> retrieveAllEmployees() {
        return service.findAll();
    }

    // Controller Add a new Employee
    @PostMapping("/employees")
    @ApiOperation(value = "Adds a new Employee.",
            notes = "Accepts name and age from the RequestBody, add id to the details and after adding the employee," +
                    " it returns the location of the employee.")
    public ResponseEntity<Object> createEmployee(@Valid @RequestBody Employee newEmployee) {
        Employee savedEmployee = service.save(newEmployee);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedEmployee
                        .getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    // Controller Retrieve one employee
    @GetMapping("/employees/{id}")
    @ApiOperation(value = "Returns details of Employee mapped with given id. ",
            notes = "Accepts the id from the path and if the employee is present," +
                    " returns the details of employee mapped with the id.",
            response = Employee.class)
    public EntityModel<Employee> retrieveEmployee(@PathVariable int id) {
        Employee employee = service.findOne(id);

        if (employee == null)
            throw new EmployeeNotFoundException("Employee Not Found for id " + id);

        EntityModel<Employee> resource = EntityModel.of(employee);

        WebMvcLinkBuilder linkTo =
                linkTo(methodOn(this.getClass()).retrieveAllEmployees());

        resource.add(linkTo.withRel("all-users"));
        //HATEOAS
        return resource;
    }

    // Controller Delete existing employee
    @DeleteMapping("/employees/{id}")
    @ApiOperation(value = "Deletes the employee details mapped with given id.",
            notes = "Accepts an Id and delete the employees details mapped with the id if it is present.")
    public void deleteEmployee(@PathVariable int id) {
        Employee deletedEmployee = service.deleteEmployee(id);
        if (deletedEmployee == null) {
        }
    }

    // Controller Update employee's age
    @PutMapping("/employees/update")
    @ApiOperation(value = "Updates details of the existing employee",
            notes = "Accepts details from the RequestBody and updates details of the employee mapped with the given Id.")
    public void updateEmpDetails(@RequestBody Employee emplUpdate) {
        Employee updated = service.updateDetails(emplUpdate);
    }
}