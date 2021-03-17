package com.springFramework.springDAAndTransactions.Repositories;

import com.springFramework.springDAAndTransactions.Entities.Bidirectional.AuthorBidirectional;
import org.springframework.data.repository.CrudRepository;

public interface RepoForBidirectional extends CrudRepository<AuthorBidirectional,Integer> {
}
