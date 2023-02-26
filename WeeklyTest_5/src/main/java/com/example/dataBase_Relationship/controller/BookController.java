package com.example.dataBase_Relationship.controller;

import com.example.dataBase_Relationship.dao.BookRepo;
import com.example.dataBase_Relationship.dao.StudentRepo;
import com.example.dataBase_Relationship.model.Book;
import com.example.dataBase_Relationship.model.Student;
import com.example.dataBase_Relationship.service.BookService;
import com.example.dataBase_Relationship.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    private StudentService studentService;
    @PostMapping("/book")
    public ResponseEntity<String> addBook(@RequestBody Book bookRequest){
        Book book=setBook(bookRequest);
        int bookId=bookService.addBook(book);
        return new ResponseEntity<>("book add successfully"+bookId, HttpStatus.CREATED);
    }

    private Book setBook(Book bookRequest) {
        Student student=null;

        Student studentDetails=studentService.getStudentById(bookRequest.getBookId());

//        if(studentRepo.findById(studentId).isPresent()){
//            student=studentRepo.findById(studentId).get();
//        }
//        else {
//            return null;
//        }
        Book book=new Book();
        book.setStudent(studentDetails);
        book.setBookTitle(bookRequest.getBookTitle());
        book.setAuthor(bookRequest.getAuthor());
        book.setDescription(bookRequest.getDescription());
        book.setPrice(bookRequest.getPrice());
        return book;
    }

    @GetMapping("book/{bookId}")
    public Book getBookById(@PathVariable Integer bookId){
        return bookService.getBookById(bookId);
    }
    @GetMapping("/book")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @PutMapping("/book/{bookId}")
    public Book updateBook(@PathVariable Integer bookId,@RequestBody Book book){
        return bookService.updateBook(bookId,book);
    }
    @DeleteMapping("/book/{bookId}")
    public void deleteBook(@PathVariable Integer bookId){
        bookService.deleteBook(bookId);
    }
}
