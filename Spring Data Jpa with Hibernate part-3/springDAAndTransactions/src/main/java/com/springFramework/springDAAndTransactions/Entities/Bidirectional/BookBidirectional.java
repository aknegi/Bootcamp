package com.springFramework.springDAAndTransactions.Entities.Bidirectional;

import com.springFramework.springDAAndTransactions.Entities.Unidirectional.AuthorUnidirectional;

import javax.persistence.*;

@Entity
public class BookBidirectional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;

    private String bookName;

    @ManyToOne
    @JoinColumn(name = "auth_id")
    private AuthorBidirectional author;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public AuthorBidirectional getAuthor() {
        return author;
    }

    public void setAuthor(AuthorBidirectional author) {
        this.author = author;
    }

}
