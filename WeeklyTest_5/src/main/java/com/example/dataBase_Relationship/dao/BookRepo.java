package com.example.dataBase_Relationship.dao;

import com.example.dataBase_Relationship.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
