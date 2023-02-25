package com.geekster.hibernatemapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_book")

public class Book {
    @Id
    private String ID;

    private String title;
    private String author;
    private String description;
    private String price;

    @ManyToOne
    private Student student;

}
