package com.example.dataBase_Relationship.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;

    private String bookTitle;
    private String author;
    private String description;
    private String price;

    @ManyToOne
    private Student student;
}
