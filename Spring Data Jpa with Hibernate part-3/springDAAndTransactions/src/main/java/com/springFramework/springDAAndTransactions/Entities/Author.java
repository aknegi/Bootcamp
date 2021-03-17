package com.springFramework.springDAAndTransactions.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.*;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authId;
    private String name;
    @Embedded
    private AuthorAddress address;

    @OneToOne(cascade = CascadeType.ALL)
    private Book book;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private Set<Subject> subjects = new HashSet<>();

    public void setBook(Book book) {
        this.book = book;
        book.setAuthor(this);
    }

    public Book getBook() {
        return book;
    }

    public void addSubject(Subject sub) {
        if (sub != null) {
            if (subjects == null) {
                subjects = new HashSet<>();
            }
            sub.setAuthor(this);
            subjects.add(sub);
        }
    }

    public AuthorAddress getAddress() {
        return address;
    }

    public void setAddress(AuthorAddress address) {
        this.address = address;
    }

    public int getAuthId() {
        return authId;
    }

    public void setAuthId(int authId) {
        this.authId = authId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
