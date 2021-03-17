package com.springFramework.springDAAndTransactions.Repositories;

import com.springFramework.springDAAndTransactions.Entities.Unidirectional.AuthorUnidirectional;
import org.springframework.data.repository.CrudRepository;

public interface RepoForUnidirectional extends CrudRepository<AuthorUnidirectional,Integer> {
}
