package com.example.demo.dto;

import com.example.demo.model.Player;
import com.example.demo.model.PlayerStats;

import java.util.List;

public class PlayerStatsDto {
    private List<Player> player;
    private PlayerStats playerStats;

    public PlayerStatsDto() {
    }

    public PlayerStatsDto(List<Player> player, PlayerStats playerStats) {
        this.player = player;
        this.playerStats = playerStats;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

    public PlayerStats getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(PlayerStats playerStats) {
        this.playerStats = playerStats;
    }
}
