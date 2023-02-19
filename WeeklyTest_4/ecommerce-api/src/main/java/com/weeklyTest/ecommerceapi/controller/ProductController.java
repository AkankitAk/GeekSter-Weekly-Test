package com.weeklyTest.ecommerceapi.controller;

import com.weeklyTest.ecommerceapi.model.Address;
import com.weeklyTest.ecommerceapi.model.Product;
import com.weeklyTest.ecommerceapi.service.AddressService;
import com.weeklyTest.ecommerceapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping(value = "/product")
    public String saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
}
