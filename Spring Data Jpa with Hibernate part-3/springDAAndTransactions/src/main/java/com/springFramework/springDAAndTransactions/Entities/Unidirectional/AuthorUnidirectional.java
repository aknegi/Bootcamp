package com.springFramework.springDAAndTransactions.Entities.Unidirectional;

import com.springFramework.springDAAndTransactions.Entities.Book;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AuthorUnidirectional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int auth_id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "auth_id")
    private Set<BookUnidirectional> books;

    public void addBook(BookUnidirectional book) {
        if (book != null) {
            if (books == null) {
                books = new HashSet<>();
            }
            books.add(book);
        }
    }

    public int getAuth_id() {
        return auth_id;
    }

    public void setAuth_id(int auth_id) {
        this.auth_id = auth_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BookUnidirectional> getBooks() {
        return books;
    }

    public void setBooks(Set<BookUnidirectional> books) {
        this.books = books;
    }


}
