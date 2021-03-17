package com.springFramework.springDAAndTransactions.Entities;

import javax.persistence.*;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subId;
    private String subName;

    @ManyToOne
    @JoinColumn(name = "auth_id")
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getSubId() {
        return subId;
    }


    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
}
