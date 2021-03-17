package com.springFramework.springDAAndTransactions.Services;

import com.springFramework.springDAAndTransactions.Entities.Unidirectional.AuthorUnidirectional;
import com.springFramework.springDAAndTransactions.Entities.Unidirectional.BookUnidirectional;
import com.springFramework.springDAAndTransactions.Repositories.RepoForUnidirectional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnidirectionalService {
    @Autowired
    RepoForUnidirectional repoForUnidirectional;

    public void addAuthorAndBook() {
        AuthorUnidirectional author = new AuthorUnidirectional();
        author.setName("Prasad");

        BookUnidirectional book1 = new BookUnidirectional();
        book1.setBookName("Energy");

        BookUnidirectional book2 = new BookUnidirectional();
        book2.setBookName("Power");

        author.addBook(book1);
        author.addBook(book2);

        repoForUnidirectional.save(author);

    }
}
