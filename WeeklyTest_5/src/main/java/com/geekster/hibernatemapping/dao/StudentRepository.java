package com.geekster.hibernatemapping.dao;

import com.geekster.hibernatemapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
