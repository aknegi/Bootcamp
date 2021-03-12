package com.SpringJPA.SpringDataAccess.Repos;

import com.SpringJPA.SpringDataAccess.Entities.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    List<Employee> findByName(String name);
    List<Employee> findByNameLike(String a);
    List<Employee> findByAgeBetween(int i, int i1);
}
