package com.springFramework.springDAAndTransactions.Services;

import com.springFramework.springDAAndTransactions.Entities.Author;
import com.springFramework.springDAAndTransactions.Entities.AuthorAddress;
import com.springFramework.springDAAndTransactions.Entities.Book;
import com.springFramework.springDAAndTransactions.Entities.Subject;
import com.springFramework.springDAAndTransactions.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public void addAuthor() {
        Author author = new Author();
        AuthorAddress address = new AuthorAddress();

        author.setName("Ravishankar");
        address.setStreetNumber(120);
        address.setLocation("New Delhi");
        address.setState("Delhi");
        author.setAddress(address); // adding address
        Subject sub1 = new Subject();
        sub1.setSubName("Hindi");
        author.addSubject(sub1);  //adding sub1
        Subject sub2 = new Subject();
        sub2.setSubName("English");
        author.addSubject(sub2);  //adding sub2
        Subject sub3 = new Subject();
        sub3.setSubName("Maths");
        author.addSubject(sub3); //adding sub3

        Book book = new Book();
        book.setBookName("Discovery");
        author.setBook(book); //adding book
        authorRepository.save(author);
    }

}