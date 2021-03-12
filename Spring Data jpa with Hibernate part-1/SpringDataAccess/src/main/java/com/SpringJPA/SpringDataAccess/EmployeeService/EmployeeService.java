package com.SpringJPA.SpringDataAccess.EmployeeService;

import com.SpringJPA.SpringDataAccess.Entities.Employee;
import com.SpringJPA.SpringDataAccess.Repos.EmployeeFilterRepository;
import com.SpringJPA.SpringDataAccess.Repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Autowired
    EmployeeFilterRepository employeeFilterRepository;

    public void addEmployee() {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Alpha");
        e1.setAge(27);
        e1.setLocation("Noida");
        repository.save(e1);
    }

    public void getEmpDetails() {
        Employee employee = repository.findById(2).get();
        System.out.println(employee.toString());
    }

    public void deleteEmployee() {
        repository.deleteById(1);
    }

    public void findByName() {
        List<Employee> employeesList = repository.findByName("Beta");
        employeesList.forEach(emp -> System.out.println("name = " + emp.getName() + ", age = " + emp.getAge()));
    }

    public void updateEmployee() {
        Employee employee = repository.findById(4).get();
        employee.setAge(31);
        repository.save(employee);
    }


    public void findByInitials() {
        List<Employee> employeeList = repository.findByNameLike("A%");
        employeeList.forEach(employee -> System.out.println(employee.getName()));
    }

    public void findByAgeInbetween() {
        List<Employee> employeeList = repository.findByAgeBetween(28, 32);
        employeeList.forEach(employee -> System.out.println(employee.getName()));
    }

    public void countEmployees() {
        System.out.println("Total number of Employees = " + repository.count());
    }

    public void pagingAndSortingOnAge() {
        Pageable pageable = PageRequest.of(0, 2, Sort.Direction.ASC, "age");
        employeeFilterRepository.findAll(pageable).forEach(emp -> System.out.println("Age = " + emp.getAge() + ", Name =" + emp.getName()));
    }
}
