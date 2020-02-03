package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    @Autowired
    private BookstoreService bookstoreService;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            System.out.println("\n\npersistAuthorWithBooks():");
            bookstoreService.persistAuthorWithBooks();

            System.out.println("\n\nfetchBookByTitle():");
            bookstoreService.fetchBookByTitle();

            System.out.println("\n\nfetchPaperback():");
            bookstoreService.fetchPaperback();
            System.out.println("\n\nfetchEbook():");
            bookstoreService.fetchEbook();

            System.out.println("\n\nfetchBooksByAuthorId():");
            bookstoreService.fetchBooksByAuthorId();
            System.out.println("\n\nfetchAuthorAndBooksLazy():");
            bookstoreService.fetchAuthorAndBooksLazy();
            System.out.println("\n\nfetchAuthorAndBooksEager():");
            bookstoreService.fetchAuthorAndBooksEager();
        };
    }
}


/*
 * 
 * 
 * 
 * JPA Inheritance - SINGLE_TABLE

Description: This application is a sample of using JPA Single Table inheritance strategy (SINGLE_TABLE).

Key points:

this is the default inheritance strategy (@Inheritance(strategy=InheritanceType.SINGLE_TABLE))
all the classes in an inheritance hierarchy are represented via a single table in the database
subclasses attributes non-nullability is ensured via @NotNull and MySQL triggers
the default discriminator column memory footprint was optimized by declaring it of type TINYINT
Output example (below is a single table obtained from 3 entities):
 * 
 * 
 * 
 * 
 */
