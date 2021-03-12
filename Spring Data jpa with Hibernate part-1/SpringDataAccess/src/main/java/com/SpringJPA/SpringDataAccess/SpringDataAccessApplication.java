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
		employeeService.pagingAndSortingOnAge();

    }
}







/*	employeeService.addEmployee();
		employeeService.deleteEmployee();
	        employeeService.updateEmployee();
		employeeService.findByName();
		        employeeService.getEmpDetails();
					employeeService.getEmpDetails();
							employeeService.countEmployees();
		employeeService.findByInitials();
		employeeService.findByAgeInbetween();*/