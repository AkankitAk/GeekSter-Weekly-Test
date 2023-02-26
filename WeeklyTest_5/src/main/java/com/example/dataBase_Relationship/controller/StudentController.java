package com.example.dataBase_Relationship.controller;

import com.example.dataBase_Relationship.model.Book;
import com.example.dataBase_Relationship.model.Student;
import com.example.dataBase_Relationship.service.BookService;
import com.example.dataBase_Relationship.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

  @Autowired
  private StudentService studentService;
        @PostMapping("/student")
        public ResponseEntity<String> addStudent(@RequestBody Student student){
            int studentId=studentService.addStudent(student);
            return new ResponseEntity<>("student save with User id- "+studentId, HttpStatus.CREATED);
        }


        @GetMapping("student/{studentId}")
        public Student getStudentById(@PathVariable Integer studentId){
            return studentService.getStudentById(studentId);
        }
        @GetMapping("/student")
        public List<Student> getAllStudent(){
            return studentService.getAllStudent();
        }
        @PutMapping("/student/{studentId}")
        public Student updateStudent(@PathVariable Integer studentId,@RequestBody Student student){
            return studentService.updateStudent(studentId,student);
        }
        @DeleteMapping("/student/{studentId}")
        public String deleteStudent(@PathVariable Integer studentId){
            studentService.deleteStudent(studentId);
            return "student delete successfully user id -"+studentId;
        }
}
