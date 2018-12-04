package com.example.demo.repository;

import com.example.demo.model.PlayerStats;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerStatsRepository extends MongoRepository<PlayerStats, String> {
    public List<PlayerStats> findById(int player_id);
}
