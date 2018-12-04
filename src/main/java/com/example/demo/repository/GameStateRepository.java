package com.example.demo.repository;

import com.example.demo.model.GameState;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameStateRepository extends MongoRepository<GameState, String> {
    public GameState findById(int game_id);

}
