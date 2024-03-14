package com.example.demo.features.sessions.entity;

import com.example.demo.features.user.entity.UserEntity;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class SessionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_session", nullable = false)
    Integer id_session;

    @Column(name = "end_session", nullable = false)
    Date end_session;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private UserEntity user;

}
