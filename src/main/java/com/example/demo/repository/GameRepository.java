package com.example.demo.repository;

import com.example.demo.model.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends MongoRepository<Game, String> {
    public Game findById(int id);
    public List<Game> findByDate(String date);
}
