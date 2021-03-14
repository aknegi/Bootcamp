package com.dataAccess.springDataJPA.Repositories;

import com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.TableStrategy.EmployeeForTableStrategy;
import org.springframework.data.repository.CrudRepository;

public interface RepoForTableStrategy extends CrudRepository<EmployeeForTableStrategy,Integer> {
}
