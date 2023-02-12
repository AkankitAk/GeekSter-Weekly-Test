package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.model.Student;

import java.util.List;

public interface IEventService {
    public List<Event> findAll();
    public Event findById(int eventId) ;
    public void addEvent(Event event);
    public void deleteEvent(int eventId) ;
    public void updateEvent(int eventId,Event newEvent) ;
}
