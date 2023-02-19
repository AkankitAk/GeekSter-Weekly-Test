package com.weeklyTest.ecommerceapi.service;

import com.weeklyTest.ecommerceapi.dao.OrderRepo;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;
    public String saveOrder(Order order) {
        return "save Order";
    }
}
