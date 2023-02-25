package com.geekster.hibernatemapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_student")

public class Student {
    @Id
    private Integer studentId;
    private String studentName;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;
    @Embedded
    private Address address;
}
