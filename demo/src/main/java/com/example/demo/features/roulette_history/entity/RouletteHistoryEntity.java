package com.example.demo.features.roulette_history.entity;
import com.example.demo.features.user.entity.UserEntity;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@Entity
@Table(name = "rulette_history")
public class RouletteHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_history", nullable = false)
    Integer id_history;

    @Column(name = "kf", nullable = false)
    Float kf;

    @Column(name = "result", nullable = false)
    Float result;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private UserEntity user;

    // Геттеры и сеттеры

    public Integer getId_history() {
        return id_history;
    }

    public void setId_history(Integer id_history) {
        this.id_history = id_history;
    }

    public Float getKf() {
        return kf;
    }

    public void setKf(Float kf) {
        this.kf = kf;
    }

    public Float getResult() {
        return result;
    }

    public void setResult(Float result) {
        this.result = result;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}

