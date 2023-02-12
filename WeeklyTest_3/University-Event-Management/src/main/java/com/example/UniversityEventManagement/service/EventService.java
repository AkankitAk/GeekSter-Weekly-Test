package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.model.Student;
import com.example.UniversityEventManagement.repository.IEventRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService implements IEventService{
    private static List<Student> todos=new ArrayList<>();
    @Autowired
    IEventRepo iEventRepo;
    @Override
    public List<Event> findAll() {
        return iEventRepo.findAll();
    }

    @Override
    public Event findById(int eventId) {
        return iEventRepo.findById(eventId).get();
    }

    @Override
    public void addEvent(Event event) {
        iEventRepo.save(event);
    }

    @Override
    public void deleteEvent(int eventId) {
        iEventRepo.deleteById(eventId);
    }
    @Override
    public void updateEvent(int eventId, Event newEvent) {
        Event event=iEventRepo.findById(eventId).get();

        event.setEventName(newEvent.getEventName());
        event.setLocationOfEvent(newEvent.getLocationOfEvent());
        event.setDate(newEvent.getDate());
        event.setStartTime(newEvent.getStartTime());
        event.setEndTime(newEvent.getEndTime());
        iEventRepo.save(event);
    }
}
