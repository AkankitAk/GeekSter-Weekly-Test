package com.example.restaurant.controller;

import com.example.restaurant.model.Restaurant;
import com.example.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/restaurant-api")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @PostMapping("/add-restaurant")
    public Restaurant add(@RequestBody Restaurant restaurant){
        return restaurantService.add(restaurant);
    }
    @GetMapping("/getByName/{name}")
    public List<Restaurant> getByName(@PathVariable String name){
       return restaurantService.getRestaurant(name);
    }
    @PutMapping("/updateByName")
    public Restaurant update(@RequestBody Restaurant restaurant){
        return restaurantService.update(restaurant);
    }
}
