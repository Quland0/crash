package com.example.demo.features.sessions.service;

import com.example.demo.features.sessions.entity.SessionEntity;
import com.example.demo.features.sessions.repository.SessionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SessionServicempl implements SessionService {

    private final SessionRepository sessionRepository;

    public SessionServicempl(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public SessionEntity createSession(SessionEntity sessionEntity) {
        return sessionRepository.save(sessionEntity);
    }

    @Override
    public List<SessionEntity> getAllSessions() {
        return sessionRepository.findAll();
    }

    @Override
    public void deleteSession(Integer sessionId) {
        sessionRepository.deleteById(sessionId);
    }


}
