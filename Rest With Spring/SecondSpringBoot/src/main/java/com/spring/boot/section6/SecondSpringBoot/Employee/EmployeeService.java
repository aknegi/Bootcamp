package com.spring.boot.section6.SecondSpringBoot.Employee;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeService {

    private static List<Employee> employees = new ArrayList<>();
    private static int idCounter = 3;

    static {
        employees.add(new Employee(1, "Alpha", 24));
        employees.add(new Employee(2, "Beta", 25));
        employees.add(new Employee(3, "Gama", 23));
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
