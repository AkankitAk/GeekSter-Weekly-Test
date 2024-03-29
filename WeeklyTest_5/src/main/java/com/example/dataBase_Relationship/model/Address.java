package com.example.dataBase_Relationship.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;
}
