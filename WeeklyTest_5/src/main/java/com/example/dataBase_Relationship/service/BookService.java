package com.example.dataBase_Relationship.service;

import com.example.dataBase_Relationship.dao.BookRepo;
import com.example.dataBase_Relationship.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;
    public int addBook(Book book) {
        Book bookObj=bookRepo.save(book);
        return bookObj.getBookId();
    }

    public Book getBookById(Integer bookId) {
        return bookRepo.findById(bookId).get();
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book updateBook(Integer bookId, Book newBook) {
        Book book= bookRepo.findById(bookId).get();
        book.setAuthor(newBook.getAuthor());
        book.setBookTitle(newBook.getBookTitle());
        book.setPrice(book.getPrice());
        book.setDescription(book.getDescription());
        book.setStudent(book.getStudent());
        return bookRepo.save(book);
    }

    public void deleteBook(Integer bookId) {
         bookRepo.deleteById(bookId);
    }
}
