package com.geekster.hibernatemapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_laptop")

public class Laptop {
    @Id
    private String ID;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne
    private Student student;
}
