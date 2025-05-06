package com.edumarketplace.backend.controller;

import com.edumarketplace.backend.model.Session;
import com.edumarketplace.backend.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class SessionController {

    private final SessionService sessionService;

    @Autowired
    public SessionController (SessionService sessionService){
        this.sessionService = sessionService;
    }

    @GetMapping("/sessions")
    public List<Session> sessionList(){
        return sessionService.getAllSessions();
    }

    @GetMapping("/session/{id}")
    public Session getSessionById(@PathVariable ("id") Long id){
        return sessionService.getSessionById(id);
    }

    @PostMapping("/session")
    public Session saveSession( @RequestBody Session session){
        return sessionService.saveSession(session);
    }

    @PutMapping("/update/session/{id}")
    public Session updateSession(@PathVariable ("id") Long id, @RequestBody Session session){
        return sessionService.updateSession(id, session);
    }

}
