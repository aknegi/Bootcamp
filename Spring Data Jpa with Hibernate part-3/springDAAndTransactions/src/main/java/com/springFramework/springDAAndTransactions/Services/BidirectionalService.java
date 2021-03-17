package com.springFramework.springDAAndTransactions.Services;

import com.springFramework.springDAAndTransactions.Entities.Bidirectional.AuthorBidirectional;
import com.springFramework.springDAAndTransactions.Entities.Bidirectional.BookBidirectional;
import com.springFramework.springDAAndTransactions.Repositories.RepoForBidirectional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BidirectionalService {

    @Autowired
    RepoForBidirectional repoForBidirectional;

    public void addAuthor() {
        AuthorBidirectional author = new AuthorBidirectional();
        BookBidirectional book = new BookBidirectional();

        author.setName("Rajendra");
        book.setBookName("Research of Science");
        author.setBook(book);

        repoForBidirectional.save(author);
    }

}
