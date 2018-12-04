package com.example.demo.service;

import com.example.demo.model.PlayerStats;
import com.example.demo.repository.PlayerStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PlayerStatsService {

    @Autowired
    private PlayerStatsRepository playerStatsRepository;


    public List<PlayerStats> getByPlayerId(int player_id) {
        return playerStatsRepository.findById(player_id);
    };

    public List<PlayerStats> getPlayerStatsByPlayerId(int player_id) {
        List<PlayerStats> playerStats = playerStatsRepository.findAll();

        Stream<PlayerStats> playerStatsById =  playerStats.stream().filter(x -> player_id == x.getPlayer_id());
        return playerStatsById.collect(Collectors.toList());
    }
}
