package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> findAll();
    public Student findById(int id) ;
    public void addTodo(Student student);
    public void deleteStudent(int id) ;
    public void updateStudent(int id,String department) ;
}
