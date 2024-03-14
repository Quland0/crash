package com.example.demo.features.sessions.controller;

import com.example.demo.features.sessions.entity.SessionEntity;
import com.example.demo.features.sessions.service.SessionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {

    private final SessionService sessionService;

    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @PostMapping
    public SessionEntity createSession(@RequestBody SessionEntity sessionEntity) {
        return sessionService.createSession(sessionEntity);
    }

    @GetMapping
    public List<SessionEntity> getAllSessions() {
        return sessionService.getAllSessions();
    }

    @DeleteMapping("/{sessionId}")
    public void deleteSession(@PathVariable Integer sessionId) {
        sessionService.deleteSession(sessionId);
    }

}
