package com.springFramework.springDAAndTransactions.Entities.Unidirectional;

import javax.persistence.*;

@Entity
public class BookUnidirectional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;

    private String bookName;

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

}
