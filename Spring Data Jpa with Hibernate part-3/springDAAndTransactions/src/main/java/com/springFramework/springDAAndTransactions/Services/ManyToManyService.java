package com.springFramework.springDAAndTransactions.Services;

import com.springFramework.springDAAndTransactions.Entities.ManyToMany.AuthorManyToMany;
import com.springFramework.springDAAndTransactions.Entities.ManyToMany.BookManyToMany;
import com.springFramework.springDAAndTransactions.Repositories.RepoForManyToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class ManyToManyService {
    @Autowired
    RepoForManyToMany repository;

    public void addAuthor() {
        AuthorManyToMany author = new AuthorManyToMany();
        author.setName("Prasad");

        BookManyToMany book = new BookManyToMany();
        book.setName("Mars");

        BookManyToMany book2 = new BookManyToMany();
        book2.setName("Eclipse");

        author.setBook(book);
        author.setBook(book2);
        repository.save(author);
    }
}
