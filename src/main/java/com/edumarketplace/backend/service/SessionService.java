package com.edumarketplace.backend.service;

import com.edumarketplace.backend.model.Session;

import java.util.List;

public interface SessionService {
    List<Session> getAllSessions();
    Session getSessionById(Long id);
    Session saveSession(Session session);
    Session updateSession(Long id, Session session);
    void removeSessionById(Long id);
}
