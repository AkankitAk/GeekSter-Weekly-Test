package com.geekster.hibernatemapping.dao;

import com.geekster.hibernatemapping.model.Book;
import com.geekster.hibernatemapping.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
