package com.example.UniversityEventManagement.repository;

import com.example.UniversityEventManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventRepo extends JpaRepository<Event,Integer> {
}
