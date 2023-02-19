package com.weeklyTest.ecommerceapi.service;

import com.weeklyTest.ecommerceapi.dao.AddressRepo;
import com.weeklyTest.ecommerceapi.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;
    public String saveAddress(Address address) {
        addressRepo.save(address);
        return "save Address";
    }
}
