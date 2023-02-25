package com.geekster.hibernatemapping.service;

import com.geekster.hibernatemapping.dao.BookRepository;
import com.geekster.hibernatemapping.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public String addBook(Book newBook) {
        Book book = bookRepository.save(newBook);
        return book.getTitle();
    }
}
