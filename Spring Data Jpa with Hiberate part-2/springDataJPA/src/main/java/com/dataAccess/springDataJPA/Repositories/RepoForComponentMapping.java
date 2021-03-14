package com.dataAccess.springDataJPA.Repositories;

import com.dataAccess.springDataJPA.Entity.EntitiesForComponentMapping.EmployeeForComponentMapping;
import org.springframework.data.repository.CrudRepository;

public interface RepoForComponentMapping extends CrudRepository<EmployeeForComponentMapping,Integer> {

}
