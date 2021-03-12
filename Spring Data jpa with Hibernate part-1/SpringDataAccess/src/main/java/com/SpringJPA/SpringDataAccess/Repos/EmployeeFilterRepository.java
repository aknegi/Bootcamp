package com.SpringJPA.SpringDataAccess.Repos;

import com.SpringJPA.SpringDataAccess.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeFilterRepository extends PagingAndSortingRepository<Employee,Integer> {
}
