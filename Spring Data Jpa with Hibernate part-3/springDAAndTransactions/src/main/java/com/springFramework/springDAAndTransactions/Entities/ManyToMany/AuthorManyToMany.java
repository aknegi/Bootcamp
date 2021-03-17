package com.springFramework.springDAAndTransactions.Entities.ManyToMany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AuthorManyToMany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_books",
            joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"))
    private Set<BookManyToMany> books;

    public void setBook(BookManyToMany book) {
        if (book != null) {
            if (books == null) {
                books = new HashSet<>();
            }
            books.add(book);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BookManyToMany> getBooks() {
        return books;
    }

    public void setBooks(Set<BookManyToMany> books) {
        this.books = books;
    }
}
