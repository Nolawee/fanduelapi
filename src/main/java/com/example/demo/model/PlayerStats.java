package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PlayerStats")
public class PlayerStats {
    @Id
    public ObjectId _id;
    private int id;
    private int game_id;
    private int player_id;
    private  int team_id;
    private int points;
    private int assists;
    private int rebounds;
    private int nerd;

    public PlayerStats() {
    }

    public PlayerStats(int id, int game_id, int player_id, int team_id, int points, int assists, int rebounds, int nerd) {
        this.id = id;
        this.game_id = game_id;
        this.player_id = player_id;
        this.team_id = team_id;
        this.points = points;
        this.assists = assists;
        this.rebounds = rebounds;
        this.nerd = nerd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getRebounds() {
        return rebounds;
    }

    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    public int getNerd() {
        return nerd;
    }

    public void setNerd(int nerd) {
        this.nerd = nerd;
    }
}
