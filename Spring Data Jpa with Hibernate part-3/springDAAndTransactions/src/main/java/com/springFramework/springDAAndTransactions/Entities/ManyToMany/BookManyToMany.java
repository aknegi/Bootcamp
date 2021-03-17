package com.springFramework.springDAAndTransactions.Entities.ManyToMany;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BookManyToMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(mappedBy = "books")
    private Set<AuthorManyToMany> authors;

    public Set<AuthorManyToMany> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<AuthorManyToMany> authors) {
        this.authors = authors;
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
}
