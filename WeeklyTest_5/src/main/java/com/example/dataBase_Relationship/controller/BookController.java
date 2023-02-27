package com.example.dataBase_Relationship.controller;

import com.example.dataBase_Relationship.dao.BookRepo;
import com.example.dataBase_Relationship.dao.StudentRepo;
import com.example.dataBase_Relationship.model.Book;
import com.example.dataBase_Relationship.model.Student;
import com.example.dataBase_Relationship.service.BookService;
import com.example.dataBase_Relationship.service.StudentService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private StudentRepo studentRepo;
    @PostMapping("/book")
    public ResponseEntity<String> addBook(@RequestBody String newBook){
        Book book=setBook(newBook);
        int bookId=bookService.saveBook(book);
        return new ResponseEntity<>("Book save with Book id- "+bookId , HttpStatus.CREATED);
    }

    private Book setBook(String newBook) {
        JSONObject bookObject=new JSONObject(newBook);
        Student student=null;
        int studentId=bookObject.getInt("student");
        if(studentRepo.findById(studentId).isPresent()){
            student=studentRepo.findById(studentId).get();
        }
        else {
            return null;
        }
        Book book=new Book();
        book.setBookTitle(bookObject.getString("bookTitle"));
        book.setAuthor(bookObject.getString("author"));
        book.setDescription(bookObject.getString("description"));
        book.setPrice(bookObject.getString("price"));
        book.setStudent(student);

        return book;
    }
    @GetMapping(value = "/book")
    public ResponseEntity<String> getStudent(@Nullable @RequestParam  String bookId){
        JSONArray bookList=bookService.getBook(bookId);
        return new ResponseEntity<>(bookList.toString(),HttpStatus.OK);
    }
    @PutMapping("/book/{bookId}")
    public ResponseEntity<String> updateStudent(@PathVariable Integer bookId,@RequestBody String updateBook){
        Book book=setBook(updateBook);
        bookService.updateBook(bookId,book);
        return new ResponseEntity<>("Book updated successfully ",HttpStatus.OK);
    }
    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Integer bookId) {
        boolean status = bookService.deleteBook(bookId);
        if (status) {
            return new ResponseEntity<>("Delete Book successfully book id- " + bookId, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Book id doesNot Exist book id- " + bookId, HttpStatus.BAD_REQUEST);
        }
    }
}
