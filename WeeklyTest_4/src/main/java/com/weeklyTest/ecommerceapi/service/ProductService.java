package com.weeklyTest.ecommerceapi.service;

import com.weeklyTest.ecommerceapi.dao.ProductRepo;
import com.weeklyTest.ecommerceapi.model.Order;
import com.weeklyTest.ecommerceapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public String saveProduct(Product product) {
        productRepo.save(product);
        return "save product";
    }

    public List<Product> getProduct(String category ) {
        List<Product> productList;
        List<Product> categoryList = null;
        productList= productRepo.findAll();
        for(Product ca:productList){
            if(ca.equals(category)){
                categoryList.add(ca);
            }
        }
        if(categoryList.isEmpty()) return productList;
        else return categoryList;
    }

    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    public String deleteById(Integer productId) {
        Product product=productRepo.getById(productId);
        if(product!=null) {
            product = null;
            return "product deleted";
        }
        else return "product not found";
    }
}
