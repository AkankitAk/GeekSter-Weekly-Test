package com.weeklyTest.ecommerceapi.controller;

import com.weeklyTest.ecommerceapi.model.Address;
import com.weeklyTest.ecommerceapi.service.AddressService;
import com.weeklyTest.ecommerceapi.service.OrderService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping(value = "/order")
    public String saveAddress(@RequestBody Order order){
        return orderService.saveOrder(order);
    }
}
