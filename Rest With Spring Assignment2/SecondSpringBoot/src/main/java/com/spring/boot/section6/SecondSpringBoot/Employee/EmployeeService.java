package com.spring.boot.section6.SecondSpringBoot.Employee;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@ApiModel(description = "Contains all the Employee services")
public class EmployeeService {

    private static List<Employee> employees = new ArrayList<>();
    private static int idCounter = 3;

    static {
        employees.add(new Employee(1, "Alpha", 24));
        employees.add(new Employee(2, "Beta", 15));
        employees.add(new Employee(3, "Gama", 23));
        employees.add(new Employee(4, "Tango", 16));
    }

    //Service Retrieve Employees whose age is less than 18
    public List<Employee> employeesAgeLessThan18() {
        List<Employee> ageLessThan18 = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() < 18)
                ageLessThan18.add(employee);
        }
        return ageLessThan18;
    }

    //Service Retrieve Employees whose age is more than 17
    public List<Employee> employeesAgeMoreThan17() {
        List<Employee> ageMoreThan17 = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() > 17)
                ageMoreThan17.add(employee);
        }
        return ageMoreThan17;
    }

    // Service Retrieve all Employees
    public List<Employee> findAll() {
        return employees;
    }

    // Service Retrieve one employee
    public Employee findOne(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id)
                return employee;
        }
        return null;
    }

    // Service Add a new Employee
    public Employee save(Employee newEmployee) {
        if (newEmployee.getId() == 0)
            newEmployee.setId(++idCounter);
        employees.add(newEmployee);
        return newEmployee;
    }

    // Service Delete existing employee
    public Employee deleteEmployee(int id) {
        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Employee empl = iterator.next();
            if (empl.getId() == id) {
                iterator.remove();
                return empl;
            }
        }
        return null;
    }

    // Service Update employee's age
    public Employee updateDetails(Employee updateDetails) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == updateDetails.getId()) {
                employee.setAge(updateDetails.age);
                return employee;
            }
        }
        return null;
    }
}
