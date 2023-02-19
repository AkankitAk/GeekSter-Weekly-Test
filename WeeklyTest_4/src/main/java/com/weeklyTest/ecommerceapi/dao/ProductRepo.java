package com.weeklyTest.ecommerceapi.dao;

import com.weeklyTest.ecommerceapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
