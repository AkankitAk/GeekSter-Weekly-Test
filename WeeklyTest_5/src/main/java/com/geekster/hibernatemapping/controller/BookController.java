package com.geekster.hibernatemapping.controller;

import com.geekster.hibernatemapping.model.Book;
import com.geekster.hibernatemapping.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping(value = "/book")
    public ResponseEntity<String> addBook(@RequestBody Book newBook) {
        String bookName =  bookService.addBook(newBook);
        return new ResponseEntity<>("Add successfully book name- "+bookName, HttpStatus.CREATED);
    }


}
