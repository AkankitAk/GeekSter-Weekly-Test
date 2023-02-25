package com.geekster.hibernatemapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_course")

public class Course {
    @Id
    private String ID;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    List<Student> studentList = new ArrayList<>();

}
