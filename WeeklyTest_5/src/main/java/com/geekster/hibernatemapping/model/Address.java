package com.geekster.hibernatemapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_address")

public class Address {
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;
}
