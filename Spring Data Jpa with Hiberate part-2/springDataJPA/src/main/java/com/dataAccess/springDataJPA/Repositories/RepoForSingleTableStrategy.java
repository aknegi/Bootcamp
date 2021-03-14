package com.dataAccess.springDataJPA.Repositories;

import com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.EntityesForSingleTableStrategy.SingleEntityTable.EmployeeForSingleTableStrategy;
import org.springframework.data.repository.CrudRepository;

public interface RepoForSingleTableStrategy extends CrudRepository<EmployeeForSingleTableStrategy, Integer> {
}
