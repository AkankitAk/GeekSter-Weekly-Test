package com.geekster.hibernatemapping.dao;

import com.geekster.hibernatemapping.model.Course;
import com.geekster.hibernatemapping.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
