package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.Student;
import com.example.UniversityEventManagement.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService implements IStudentService {
    private static List<Student> todos=new ArrayList<>();
    @Autowired
    IStudentRepo iStudentRepo;
    @Override
    public List<Student> findAll() {
        return iStudentRepo.findAll();
    }

    @Override
    public Student findById(int studentId) {
        return iStudentRepo.findById(studentId).get();
    }

    @Override
    public void addTodo(Student student) {
        iStudentRepo.save(student);
    }

    @Override
    public void deleteStudent(int studentId) {
        iStudentRepo.deleteById(studentId);
    }

    @Override
    public void updateStudent(int studentId, String department) {
        Student student=iStudentRepo.findById(studentId).get();
        student.setDepartment(department);

        iStudentRepo.save(student);
    }
}
