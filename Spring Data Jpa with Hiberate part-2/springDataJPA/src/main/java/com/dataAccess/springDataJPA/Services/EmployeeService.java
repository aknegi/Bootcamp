package com.dataAccess.springDataJPA.Services;

import com.dataAccess.springDataJPA.Entity.EntitiesForComponentMapping.EmployeeForComponentMapping;
import com.dataAccess.springDataJPA.Entity.EntitiesForComponentMapping.Salary;
import com.dataAccess.springDataJPA.Repositories.EmployeeRepository;
import com.dataAccess.springDataJPA.Repositories.RepoForComponentMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    RepoForComponentMapping repoForComponentMapping;


    // For JPQL

    public void getByAvgSal() {
        Sort order = Sort.by(Sort.Order.asc("age"), Sort.Order.desc("salary"));
        List<Object[]> employeesNameArray = employeeRepository.searchBySalaryMoreThanAvg(order);
        for (Object[] objects : employeesNameArray) {
            System.out.print(objects[0] + " ");
            System.out.println(objects[1]);
        }
    }

    @Transactional
    public void updateSalary(int updatedSalary) {
        List<Integer> allIds = employeeRepository.getIdWhereSalaryLessThanAvgSalary();
        for (Integer id : allIds) {
            employeeRepository.updateEmpSalary(updatedSalary, id);
        }
    }

    @Transactional
    public void deleteEmployeeWithMinSalary(int minSal) {
        employeeRepository.deleteEmployee(minSal);
    }


    // For Native Query
    public void getEmpDetailsWithNativeQuery() {
        List<Object[]> employeesNameArray = employeeRepository.getEmployeeDetails();
        for (Object[] objects : employeesNameArray) {
            System.out.println("Id = " + objects[0] + ", First Name = " + objects[1] + ", Age = " + objects[2]);
        }
    }

    @Transactional
    public void deleteDataByGivenAge(int age) {
        employeeRepository.deleteByGivenAge(age);
    }


    //For Component Mapping
    public void addEmployee() {
        EmployeeForComponentMapping employeeHasSalary = new EmployeeForComponentMapping();
        Salary salary = new Salary();

        employeeHasSalary.setFirstName("Charlie");
        employeeHasSalary.setLastName("Chopra");
        employeeHasSalary.setAge(31);

        salary.setBasicSalary(30000);
        salary.setBonusSalary(5000);
        salary.setTaxAmount(2400);
        salary.setSpecialAllowanceSalary(3500);
        employeeHasSalary.setSalary(salary);

        repoForComponentMapping.save(employeeHasSalary);
    }
}
