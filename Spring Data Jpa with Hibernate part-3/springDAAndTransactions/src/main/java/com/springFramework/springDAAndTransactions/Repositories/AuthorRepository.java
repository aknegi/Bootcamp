package com.springFramework.springDAAndTransactions.Repositories;

import com.springFramework.springDAAndTransactions.Entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository  extends CrudRepository<Author,Integer> {
}
