package com.example.demo.controller;


import com.example.demo.dto.GameReturnDto;
import com.example.demo.model.Game;
import com.example.demo.model.GameState;
import com.example.demo.service.GameService;
import com.example.demo.service.GameStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    @Autowired
    GameService gameService;

    @Autowired
    GameStateService gameStateService;

    @RequestMapping("/nba/games")
    public List<Game> getAll(){
        return gameService.getAll();
    }

    @RequestMapping("/nba/games/{id}")
    public GameReturnDto getbyId(@PathVariable String id){
        int teamId = Integer.parseInt(id);
        Game game = gameService.getById(teamId);
        GameState gameState = gameStateService.getGameState(teamId);
        return new GameReturnDto(game, gameState);
    }

}
