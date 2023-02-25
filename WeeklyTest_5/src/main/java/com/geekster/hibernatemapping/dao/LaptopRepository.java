package com.geekster.hibernatemapping.dao;

import com.geekster.hibernatemapping.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
}
