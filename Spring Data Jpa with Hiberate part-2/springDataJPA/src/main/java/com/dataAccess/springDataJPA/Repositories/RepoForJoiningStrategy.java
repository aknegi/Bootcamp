package com.dataAccess.springDataJPA.Repositories;

import com.dataAccess.springDataJPA.Entity.EntitiesForInheritanceMapping.JoiningStrategy.EmployeeForJoiningStrategy;
import org.springframework.data.repository.CrudRepository;

public interface RepoForJoiningStrategy extends CrudRepository<EmployeeForJoiningStrategy,Integer> {
}
