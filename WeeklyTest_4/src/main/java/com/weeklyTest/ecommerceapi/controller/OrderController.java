package com.weeklyTest.ecommerceapi.controller;

import com.weeklyTest.ecommerceapi.service.OrderService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping(value = "/order")
    public String saveAddress(@RequestBody Order order){
        return orderService.saveOrder(order);
    }

    @GetMapping(value = "/get-order")
    public com.weeklyTest.ecommerceapi.model.Order getOrder(@RequestParam Integer oderId){
        return orderService.getOder(oderId);
    }
}
