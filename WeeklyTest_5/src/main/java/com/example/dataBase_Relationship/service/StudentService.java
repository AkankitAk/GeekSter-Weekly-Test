package com.example.dataBase_Relationship.service;

import com.example.dataBase_Relationship.dao.StudentRepo;
import com.example.dataBase_Relationship.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public int addStudent(Student student) {
        Student obj=studentRepo.save(student);
        return obj.getStudentId();
    }

    public Student getStudentById(Integer studentId) {
        return studentRepo.findById(studentId).get();
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public Student updateStudent(Integer studentId, Student student) {
        Student student1= studentRepo.findById(studentId).get();
        student1.setStudentAge(student.getStudentAge());
        student1.setStudentBranch(student.getStudentBranch());
        student1.setStudentName(student.getStudentName());
        student1.setStudentNumber(student.getStudentNumber());
        student1.setAddress(student.getAddress());
        student1.setStudentDepartment(student.getStudentDepartment());
        return studentRepo.save(student1);
    }

    public void deleteStudent(Integer studentId) {
        studentRepo.deleteById(studentId);
    }

}
