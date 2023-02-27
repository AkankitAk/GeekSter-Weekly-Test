package com.example.dataBase_Relationship.service;

import com.example.dataBase_Relationship.dao.StudentRepo;
import com.example.dataBase_Relationship.model.Student;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public int saveStudent(Student student) {
        Student obj=studentRepo.save(student);
        return obj.getStudentId();
    }

    public JSONArray getStudent(String studentId) {
        JSONArray studentArray=new JSONArray();
        if(studentId!=null && studentRepo.findById(Integer.valueOf(studentId)).isPresent()){
            Student student=studentRepo.findById(Integer.valueOf(studentId)).get();
            studentArray.put(student);
        }
        else {
            List<Student> studentList=studentRepo.findAll();
            for(Student student:studentList){
                studentArray.put(student);
            }
        }
        return studentArray;
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



    public ResponseEntity<String> deleteStudent(Integer studentId) {
        studentRepo.deleteById(studentId);
        return new ResponseEntity<>("Delete Student successfully student id- "+studentId, HttpStatus.OK);
    }
}
