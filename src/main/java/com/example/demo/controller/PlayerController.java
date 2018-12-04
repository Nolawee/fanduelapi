package com.example.demo.controller;

import com.example.demo.model.Player;
import com.example.demo.model.PlayerStats;
import com.example.demo.service.PlayerService;
import com.example.demo.service.PlayerStatsService;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @Autowired
    PlayerStatsService playerStatsService;

    @RequestMapping("/nba/players")
    public List<Player> getAll() {

        return playerService.getAll();
    }

//    @RequestMapping("/nba/players")
//    public List<Player> getAll(@RequestParam(value = "date", required = false) String date){
//        if(StringUtils.isEmpty(date) || StringUtils.isEmpty(date)) {
//            date = date.replace("/", "");
//        }
//        return playerService.getAll(date);
//    }

    @RequestMapping("/nba/players/{id}")
    public Player getbyId(@PathVariable String id){
        int playerId = Integer.parseInt(id);
        return playerService.getById(playerId);
    }


    @RequestMapping("/nba/players/{id}/stats")
    public List<PlayerStats> getStatsById(@PathVariable String id){
        int playerId = Integer.parseInt(id);
        return playerStatsService.getPlayerStatsByPlayerId(playerId);
    }


}
