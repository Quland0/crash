package com.example.demo.features.roulette_history.repository;

import com.example.demo.features.roulette_history.entity.RouletteHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouletteHistoryRepository extends JpaRepository<RouletteHistoryEntity, Integer> {

}