package com.dataAccess.springDataJPA;

import com.dataAccess.springDataJPA.Services.EmployeeService;
import com.dataAccess.springDataJPA.Services.ServiceForJoiningStrategy;
import com.dataAccess.springDataJPA.Services.ServiceForSingleTableStragegy;
import com.dataAccess.springDataJPA.Services.ServiceForTableStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
        EmployeeService employeeService= context.getBean(EmployeeService.class);
        employeeService.updateSalary(38000);

    }
}


// For JPQL
/*  EmployeeService employeeService= context.getBean(EmployeeService.class);
    employeeService.getByAvgSal();
    employeeService.updateSalary(38000);
    employeeService.deleteEmployeeWithMinSalary(29000);

// For Native Query
    EmployeeService employeeService= context.getBean(EmployeeService.class);
    employeeService.getEmpDetailsWithNativeQuery();
    employeeService.deleteDataByGivenAge(45);
    */


// For Single Table Strategy
/* ServiceForSingleTableStragegy singleTableEmployee = context.getBean(ServiceForSingleTableStragegy.class);
        singleTableEmployee.addPermanentEmployee();
        singleTableEmployee.addTraineeEmployee();*/

// For Joining Strategy
/* ServiceForJoiningStrategy serviceForJoiningStrategy = context.getBean(ServiceForJoiningStrategy.class);
        serviceForJoiningStrategy.addPermanentEmployee();
        serviceForJoiningStrategy.addTraineeEmployee();*/

// For Table per Class Strategy
/* ServiceForTableStrategy serviceForTableStrategy = context.getBean(ServiceForTableStrategy.class);
        serviceForTableStrategy.addPermanentEmployee();
        serviceForTableStrategy.addTraineeEmployee();*/

// For Component Mapping.
/*  EmployeeService employeeService= context.getBean(EmployeeService.class);
        employeeService.addEmployee();*/
