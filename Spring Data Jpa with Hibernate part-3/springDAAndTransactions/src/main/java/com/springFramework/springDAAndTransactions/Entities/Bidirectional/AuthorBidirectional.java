package com.springFramework.springDAAndTransactions.Entities.Bidirectional;

import com.springFramework.springDAAndTransactions.Entities.Unidirectional.BookUnidirectional;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AuthorBidirectional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int auth_id;

    private String name;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private Set<BookBidirectional> books = new HashSet<>();

    public void setBook(BookBidirectional book) {
        if (book != null) {
            if (books == null) {
                books = new HashSet<>();
            }
            book.setAuthor(this);
            books.add(book);
        }
    }

    public Set<BookBidirectional> getBooks() {
        return books;
    }

    public void setBooks(Set<BookBidirectional> books) {
        this.books = books;
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
}

