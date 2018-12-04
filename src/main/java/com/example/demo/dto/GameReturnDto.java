package com.example.demo.dto;

import com.example.demo.model.Game;
import com.example.demo.model.GameState;

public class GameReturnDto {
    private Game game;
    private GameState gameState;

    public GameReturnDto(Game game, GameState gameState) {
        this.game = game;
        this.gameState = gameState;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
