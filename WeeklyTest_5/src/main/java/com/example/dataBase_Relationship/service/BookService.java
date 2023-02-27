package com.example.dataBase_Relationship.service;

import com.example.dataBase_Relationship.dao.BookRepo;
import com.example.dataBase_Relationship.model.Book;
import com.example.dataBase_Relationship.model.Student;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;
    public int saveBook(Book book) {
        Book bookObj=bookRepo.save(book);
        return bookObj.getBookId();
    }

    public JSONArray getBook(String bookId) {
        JSONArray bookArray=new JSONArray();
        if(bookId!=null && bookRepo.findById(Integer.valueOf(bookId)).isPresent()){
            Book book=bookRepo.findById(Integer.valueOf(bookId)).get();
            bookArray.put(book);
        }
        else {
            List<Book> booksList=bookRepo.findAll();
            for(Book book:booksList){
                bookArray.put(book);
            }
        }
        return bookArray;
    }
    public Book updateBook(Integer bookId, Book newBook) {
        Book book= bookRepo.findById(bookId).get();
        book.setAuthor(newBook.getAuthor());
        book.setBookTitle(newBook.getBookTitle());
        book.setPrice(newBook.getPrice());
        book.setDescription(newBook.getDescription());
        book.setStudent(newBook.getStudent());
        return bookRepo.save(book);
    }

    public boolean deleteBook(Integer bookId) {
        if(bookRepo.findById(bookId).isPresent()){
            bookRepo.deleteById(bookId);
            return true;
        }
        else {
            return false;
        }
    }
}
