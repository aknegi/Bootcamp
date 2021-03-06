package com.spring.boot.section6.SecondSpringBoot.Employee;

import com.spring.boot.section6.SecondSpringBoot.Exceptions.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // controller Print Welcome Message
    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Welcome to spring boot";
    }

    // Controller Retrieve all Employees
    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployees() {
        return service.findAll();
    }

    // Controller Add a new Employee
    @PostMapping("/employees")
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
    public Employee retrieveEmployee(@PathVariable int id) {
        Employee emp = service.findOne(id);
        if (emp == null) {
            throw new EmployeeNotFoundException("Employee Not Found for id " + id);
        }
        return emp;
    }


    // Controller Delete existing employee
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        Employee deletedEmployee = service.deleteEmployee(id);
        if (deletedEmployee == null) {
        }
    }

    // Controller Update employee's age
    @PutMapping("/employees/update")
    public void updateEmpDetails(@RequestBody Employee emplUpdate) {
        Employee updated = service.updateDetails(emplUpdate);
    }
}