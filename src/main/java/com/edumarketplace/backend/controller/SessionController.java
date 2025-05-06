package com.edumarketplace.backend.controller;

import com.edumarketplace.backend.model.Session;
import com.edumarketplace.backend.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class SessionController {

    private final SessionService sessionService;

    @Autowired
    public SessionController (SessionService sessionService){
        this.sessionService = sessionService;
    }

    @PostMapping("/session")
    public Session saveSession(Session session){
        return sessionService.saveSession(session);
    }

    @GetMapping("/sessions")
    public List<Session> sessionList(){
        return sessionService.getAllSessions();
    }

}
