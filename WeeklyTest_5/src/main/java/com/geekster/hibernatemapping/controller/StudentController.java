package com.geekster.hibernatemapping.controller;

import com.geekster.hibernatemapping.model.Student;
import com.geekster.hibernatemapping.service.StudentService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/student")
    public ResponseEntity<String> addStudent(@RequestBody Student  newStudent){
        int studentId =  studentService.addStudent(newStudent);
        return new ResponseEntity<>("user created user id- "+studentId, HttpStatus.OK);
    }
    @GetMapping(value = "/student")
    public ResponseEntity<String> getStudent(@Nullable @RequestParam String studentId) {

        JSONArray studentDetails = studentService.getStudent(studentId);
        return new ResponseEntity(studentDetails.toString(), HttpStatus.OK);
    }
}
