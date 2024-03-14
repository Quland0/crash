package com.example.demo.features.sessions.entity;

import com.example.demo.features.user.entity.UserEntity;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Table(name = "sessions")
public class SessionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_session", nullable = false)
    Integer id_session;

    @Column(name = "end_session", nullable = false)
    Date end_session;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private UserEntity user;

    public SessionEntity(int id_session, Date end_session, UserEntity user) {
        this.id_session = id_session;
        this.end_session = end_session;
        this.user = user;
    }

    // Геттеры и сеттеры
    public Integer getId_session() {
        return id_session;
    }

    public void setId_session(Integer id_session) {
        this.id_session = id_session;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Date getEnd_session() {
        return end_session;
    }

    public void setEnd_session(Date end_session) {
        this.end_session = end_session;
    }
}


