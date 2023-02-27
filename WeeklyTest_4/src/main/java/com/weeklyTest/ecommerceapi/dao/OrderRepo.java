package com.weeklyTest.ecommerceapi.dao;

import com.weeklyTest.ecommerceapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {
}
