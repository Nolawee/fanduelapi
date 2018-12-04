package com.example.demo.service;

import com.example.demo.model.GameState;
import com.example.demo.repository.GameStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameStateService {

    @Autowired
    private GameStateRepository gameStateRepository;

    public GameState getGameState(int game_id) {
        return gameStateRepository.findById(game_id);
    }
}
