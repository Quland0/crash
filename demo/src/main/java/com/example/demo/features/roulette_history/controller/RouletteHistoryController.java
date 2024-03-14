package com.example.demo.features.roulette_history.controller;

import com.example.demo.features.roulette_history.entity.RouletteHistoryEntity;
import com.example.demo.features.roulette_history.service.RouletteHistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roulette-history")
public class RouletteHistoryController {

    private final RouletteHistoryService rouletteHistoryService;

    public RouletteHistoryController(RouletteHistoryService rouletteHistoryService) {
        this.rouletteHistoryService = rouletteHistoryService;
    }

    @PostMapping
    public RouletteHistoryEntity createRouletteHistory(@RequestBody RouletteHistoryEntity rouletteHistoryEntity) {
        return rouletteHistoryService.createRouletteHistory(rouletteHistoryEntity);
    }

    @GetMapping
    public List<RouletteHistoryEntity> getAllRouletteHistory() {
        return rouletteHistoryService.getAllRouletteHistory();
    }

    @DeleteMapping("/{rouletteHistoryId}")
    public void deleteRouletteHistory(@PathVariable Integer rouletteHistoryId) {
        rouletteHistoryService.deleteRouletteHistory(rouletteHistoryId);
    }

}
