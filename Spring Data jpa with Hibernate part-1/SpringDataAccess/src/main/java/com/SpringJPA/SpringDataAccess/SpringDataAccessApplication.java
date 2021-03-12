package com.SpringJPA.SpringDataAccess;

import com.SpringJPA.SpringDataAccess.EmployeeService.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataAccessApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataAccessApplication.class, args);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        employeeService.addEmployee("Alpha", 27, "Noida");  //add an employee

        // adding some more employees.
        employeeService.addEmployee("Beta", 24, "Gurugram");
        employeeService.addEmployee("Theta", 23, "Gurugram");
        employeeService.addEmployee("Beta", 22, "Noida");

        employeeService.getEmpDetails();
        employeeService.updateEmployee();
        employeeService.deleteEmployee();
        employeeService.countEmployees();
        employeeService.findByName();
        employeeService.findByInitials();
        employeeService.findByAgeInbetween();

        employeeService.pagingAndSortingOnAge();

    }
}