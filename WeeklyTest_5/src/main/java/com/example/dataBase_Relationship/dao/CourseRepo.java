package com.example.dataBase_Relationship.dao;

import com.example.dataBase_Relationship.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
