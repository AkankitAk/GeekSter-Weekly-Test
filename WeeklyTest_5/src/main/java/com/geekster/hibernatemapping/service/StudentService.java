package com.geekster.hibernatemapping.service;

import com.geekster.hibernatemapping.dao.StudentRepository;
import com.geekster.hibernatemapping.model.Student;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public int addStudent(Student newStudent) {
        Student studentObj=studentRepository.save(newStudent);
        return studentObj.getStudentId();
    }

    public JSONArray getStudent(String studentId) {
        JSONArray studentArray = new JSONArray();

        if( null != studentId && studentRepository.findById(Integer.valueOf(studentId)).isPresent()) {

            Student student = studentRepository.findById(Integer.valueOf(studentId)).get();
            JSONObject studentObj = setStudent(student);
            studentArray.put(studentObj);
        } else {
            List<Student> studentsList = studentRepository.findAll();
            for (Student student: studentsList) {
                JSONObject studentObj = setStudent(student);
                studentArray.put(studentObj);
            }
        }
        return studentArray;
    }

    private JSONObject setStudent (Student student) {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("studentId", student.getStudentId());
        jsonObject.put("studentName", student.getStudentName());
        jsonObject.put("age", student.getAge());
        jsonObject.put("phoneNumber", student.getPhoneNumber());
        jsonObject.put("branch", student.getBranch());
        jsonObject.put("department", student.getDepartment());

        return jsonObject;

    }
}
