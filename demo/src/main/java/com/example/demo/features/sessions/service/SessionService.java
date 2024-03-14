package com.example.demo.features.sessions.service;

import com.example.demo.features.sessions.entity.SessionEntity;
import java.util.List;

public interface SessionService {
    SessionEntity createSession(SessionEntity sessionEntity);
    List<SessionEntity> getAllSessions();
    void deleteSession(Integer sessionId);

}
