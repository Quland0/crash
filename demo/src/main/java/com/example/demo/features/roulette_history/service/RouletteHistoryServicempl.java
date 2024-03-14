package com.example.demo.features.roulette_history.service;

import com.example.demo.features.roulette_history.entity.RouletteHistoryEntity;
import com.example.demo.features.roulette_history.repository.RouletteHistoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RouletteHistoryServicempl implements RouletteHistoryService {

    private final RouletteHistoryRepository rouletteHistoryRepository;

    public RouletteHistoryServicempl(RouletteHistoryRepository rouletteHistoryRepository) {
        this.rouletteHistoryRepository = rouletteHistoryRepository;
    }

    @Override
    public RouletteHistoryEntity createRouletteHistory(RouletteHistoryEntity rouletteHistoryEntity) {
        return rouletteHistoryRepository.save(rouletteHistoryEntity);
    }

    @Override
    public List<RouletteHistoryEntity> getAllRouletteHistory() {
        return rouletteHistoryRepository.findAll();
    }

    @Override
    public void deleteRouletteHistory(Integer rouletteHistoryId) {
        rouletteHistoryRepository.deleteById(rouletteHistoryId);
    }
}
