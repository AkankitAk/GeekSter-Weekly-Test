package com.example.UniversityEventManagement.controller;

import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event")
public class EventController {
    @Autowired
    IEventService iEventService;

    @PostMapping("/addEvent")
    public String addStudent(@RequestBody Event event){
        iEventService.addEvent(event);
        return "Event add Successfully Event id: "+event.getEventId()+" "+event.getEventName();
    }

    @GetMapping("/find-event/eventId/{eventId}")
    public Event findById(@PathVariable int eventId){
        Event event=iEventService.findById(eventId);
        return event;
    }

    @GetMapping("/find-all-event")
    public List<Event> findAll(){
        return iEventService.findAll();
    }

    @PatchMapping("/update-event/eventId/{eventId}")
    public String updateById(@PathVariable int eventId,@RequestBody Event event){
        iEventService.updateEvent(eventId,event);
        return "Update Event successfully "+event.getEventName();
    }
    @DeleteMapping("/delete-event/eventId/{eventId}")
    public String deleteById(@PathVariable int eventId){
        iEventService.deleteEvent(eventId);
        return "Event Deleted Successfully";
    }
}
