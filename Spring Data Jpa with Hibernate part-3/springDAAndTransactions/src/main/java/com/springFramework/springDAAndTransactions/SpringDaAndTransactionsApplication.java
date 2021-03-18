package com.springFramework.springDAAndTransactions;

import com.springFramework.springDAAndTransactions.Services.AuthorService;
import com.springFramework.springDAAndTransactions.Services.BidirectionalService;
import com.springFramework.springDAAndTransactions.Services.ManyToManyService;
import com.springFramework.springDAAndTransactions.Services.UnidirectionalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDaAndTransactionsApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDaAndTransactionsApplication.class, args);
        ManyToManyService service =context.getBean(ManyToManyService.class);
        service.addAuthor();
    }
}

/*		AuthorService service= context.getBean(AuthorService.class);
		service.addAuthor();*/

/*		BidirectionalService service= context.getBean(BidirectionalService.class);
		service.addAuthor();*/

/*		ManyToManyService service =context.getBean(ManyToManyService.class);
		service.addAuthor();*/

/*		UnidirectionalService service = context.getBean(UnidirectionalService.class);
		service.addAuthorAndBook();*/