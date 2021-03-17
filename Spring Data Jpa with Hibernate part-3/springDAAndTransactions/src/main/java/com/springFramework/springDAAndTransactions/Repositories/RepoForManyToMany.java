package com.springFramework.springDAAndTransactions.Repositories;

import com.springFramework.springDAAndTransactions.Entities.ManyToMany.AuthorManyToMany;
import org.springframework.data.repository.CrudRepository;

public interface RepoForManyToMany extends CrudRepository<AuthorManyToMany,Integer> {
}
