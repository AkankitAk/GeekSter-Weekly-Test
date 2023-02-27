package com.example.dataBase_Relationship.controller;

import com.example.dataBase_Relationship.model.Address;
import com.example.dataBase_Relationship.model.Student;
import com.example.dataBase_Relationship.service.StudentService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;



@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<String> addStudent(@RequestBody String newStudent){
        Student student=setStudent(newStudent);
        int studentId=studentService.saveStudent(student);
        return new ResponseEntity<>("student save with User id- "+studentId , HttpStatus.CREATED);
    }

    private Student setStudent(String newStudent) {
        JSONObject jsonObject=new JSONObject(newStudent);

        JSONObject  addressObject=jsonObject.getJSONObject("address");

        Student student=new Student();
        Address address=new Address();

        student.setStudentName(jsonObject.getString("studentName"));
        student.setStudentAge(jsonObject.getString("studentAge"));
        student.setStudentNumber(jsonObject.getString("studentNumber"));
        student.setStudentBranch(jsonObject.getString("studentBranch"));
        student.setStudentDepartment(jsonObject.getString("studentDepartment"));

        address.setLandmark(addressObject.getString("landmark"));
        address.setZipcode(addressObject.getString("zipcode"));
        address.setDistrict(addressObject.getString("district"));
        address.setState(addressObject.getString("state"));
        address.setCountry(addressObject.getString("country"));

        student.setAddress(address);
        return student;
    }

    @GetMapping(value = "/student")
    public ResponseEntity<String> getStudent(@Nullable @RequestParam  String studentId){
        JSONArray studentList=studentService.getStudent(studentId);
        return new ResponseEntity<>(studentList.toString(),HttpStatus.OK);
    }

    @PutMapping("/student/{studentId}")
    public ResponseEntity<String> updateStudent(@PathVariable Integer studentId,@RequestBody String updateStudent){
        Student student=setStudent(updateStudent);
        studentService.updateStudent(studentId,student);
        return new ResponseEntity<>("User Updated user id- "+studentId,HttpStatus.OK);
    }

    @DeleteMapping("/student/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId){
        studentService.deleteStudent(studentId);
        return "student delete successfully user id -"+studentId;
    }
}
