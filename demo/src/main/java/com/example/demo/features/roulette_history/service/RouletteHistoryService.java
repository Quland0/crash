package com.example.demo.features.roulette_history.service;

import com.example.demo.features.roulette_history.entity.RouletteHistoryEntity;
import java.util.List;

public interface RouletteHistoryService {
    RouletteHistoryEntity createRouletteHistory(RouletteHistoryEntity rouletteHistoryEntity);
    List<RouletteHistoryEntity> getAllRouletteHistory();
    void deleteRouletteHistory(Integer rouletteHistoryId);
}