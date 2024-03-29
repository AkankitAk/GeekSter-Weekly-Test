package com.weeklyTest.ecommerceapi.controller;

import com.sun.istack.Nullable;
import com.weeklyTest.ecommerceapi.model.Product;
import com.weeklyTest.ecommerceapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping(value = "/product")
    public String saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @GetMapping(value = "/product/category")
    public List<Product> getProduct(@Nullable @RequestParam String category ){
        return productService.getProduct(category);
    }
    @GetMapping(value = "/product")
    public List<Product> getAllProduct( ){
        return productService.getAllProduct();
    }
    @DeleteMapping(value = "delete-by-id")
    public String deleteById(@RequestParam Integer productId){
        return productService.deleteById(productId);
    }
}
