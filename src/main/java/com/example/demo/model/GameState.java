package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "GameState")
public class GameState {

    @Id
    public ObjectId _id;
    private int id;
    private int game_id;
    private int home_team_score;
    private int away_team_score;
    private String broadcast;
    private int quarter;
    private String time_left_in_quarter;
    private String game_status;

    public GameState() {
    }

    public GameState(int id, int game_id, int home_team_score, int away_team_score, String broadcast, int quarter, String time_left_in_quarter, String game_status) {
        this.id = id;
        this.game_id = game_id;
        this.home_team_score = home_team_score;
        this.away_team_score = away_team_score;
        this.broadcast = broadcast;
        this.quarter = quarter;
        this.time_left_in_quarter = time_left_in_quarter;
        this.game_status = game_status;
    }

    // ObjectId needs to be converted to string
    public String get_id() { return _id.toHexString(); }
    public void set_id(ObjectId _id) { this._id = _id; }

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

    public int getHome_team_score() {
        return home_team_score;
    }

    public void setHome_team_score(int home_team_score) {
        this.home_team_score = home_team_score;
    }

    public int getAway_team_score() {
        return away_team_score;
    }

    public void setAway_team_score(int away_team_score) {
        this.away_team_score = away_team_score;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public String getTime_left_in_quarter() {
        return time_left_in_quarter;
    }

    public void setTime_left_in_quarter(String time_left_in_quarter) {
        this.time_left_in_quarter = time_left_in_quarter;
    }

    public String getGame_status() {
        return game_status;
    }

    public void setGame_status(String game_status) {
        this.game_status = game_status;
    }
}
