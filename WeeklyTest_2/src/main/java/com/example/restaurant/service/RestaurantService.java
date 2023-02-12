package com.example.restaurant.service;

import com.example.restaurant.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    static List<Restaurant> restaurants=new ArrayList<>();

    //Add restaurant
    public Restaurant add(Restaurant restaurant) {
        restaurants.add(restaurant);
        return restaurant;
    }


    // get Restaurant
    public List<Restaurant> getRestaurant(String name) {
        List<Restaurant> al=new ArrayList<>();
        for (Restaurant res:restaurants){
            if(res.getName().equals(name)){
                al.add(res);
            }
        }
        for (Restaurant res:al){
            System.out.println(res);
        }
        return al;
    }
    //update Restaurant

    public Restaurant update(Restaurant obj){

        for (Restaurant res:restaurants) {
            if (res.getName().equals(obj.getName())) {
                res.setName(obj.getName());
                res.setAddress(obj.getAddress());
                res.setPhoneNo(obj.getPhoneNo());
                res.setSpecification(obj.getSpecification());
                res.setTotalStaff(obj.getTotalStaff());
            }
        }

        return obj;
    }
}
