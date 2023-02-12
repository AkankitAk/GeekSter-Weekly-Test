package com.example.UniversityEventManagement.controller;

import com.example.UniversityEventManagement.model.Student;
import com.example.UniversityEventManagement.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    IStudentService iStudentService;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        iStudentService.addStudent(student);
        return "Student add Successfully Student id: "+student.getStudentId()+" "+student.getFirstName();
    }

    @GetMapping("/find-student/studentId/{studentId}")
    public Student findById(@PathVariable int studentId){
        Student student=iStudentService.findById(studentId);
        return student;
    }
    @GetMapping("/find-all-student")
    public List<Student> findAll(){
        return iStudentService.findAll();
    }

    @PatchMapping("/update-student/studentId/{studentId}/department/{department}")
    public String updateById(@PathVariable int studentId,@PathVariable String department){
        iStudentService.updateStudent(studentId,department);
        return "Update Student successfully ";
    }
    @DeleteMapping("/delete-student/studentId/{studentId}")
    public String deleteById(@PathVariable int studentId){
        iStudentService.deleteStudent(studentId);
        return "Student Deleted Successfully";
    }

}
