package com.dataAccess.springDataJPA.Repositories;

import com.dataAccess.springDataJPA.Entity.EntitiesForJPQL_AndNativeSQL.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

    // For JPQL
    @Query("select firstName, lastName from Employee where salary > (select avg(salary) from Employee )")
    List<Object[]> searchBySalaryMoreThanAvg(Sort order);

    @Query("select id from Employee where salary < (select avg(salary) from Employee)")
    List<Integer> getIdWhereSalaryLessThanAvgSalary();

    @Modifying
    @Query("UPDATE Employee set salary = :updatedSalary where id= :givenId")
    void updateEmpSalary(@Param("updatedSalary") int updatedSalary, @Param("givenId") int id);

    @Modifying
    @Query("DELETE from Employee where salary < :minSalary")
    void deleteEmployee(@Param("minSalary") int salary);


    // For Native Query
    @Query(value = "select emp_id, emp_first_name, emp_age from employee_table where emp_last_name = 'Singh' ", nativeQuery = true)
    List<Object[]> getEmployeeDetails();

    @Modifying
    @Query(value = " DELETE FROM employee_table where emp_age > :givenAge", nativeQuery = true)
    void deleteByGivenAge(@Param("givenAge") int age);
}