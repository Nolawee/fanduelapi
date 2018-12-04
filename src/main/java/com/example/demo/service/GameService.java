package com.example.demo.service;


import com.example.demo.model.Game;
import com.example.demo.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    //Retrieve operation
    public List<Game> getAll(){
        return gameRepository.findAll();
    }

    //Retrieve operation
    public Game getById(int id){
        return gameRepository.findById(id);
    }



}
