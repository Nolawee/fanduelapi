package com.example.demo.service;

import com.example.demo.dto.PlayerStatsDto;
import com.example.demo.model.Game;
import com.example.demo.model.Player;
import com.example.demo.model.PlayerStats;
import com.example.demo.repository.GameRepository;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.repository.PlayerStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerStatsRepository playerStatsRepository;

    @Autowired
    private GameRepository gameRepository;

    @Autowired


    //Retrieve operation
    public List<Player> getAll(){
        return playerRepository.findAll();
    }

    //Retrieve operation
//    public List<PlayerStatsDto> getAllByDate(String date){
//        List<PlayerStatsDto> playerStatsDtos;
//        //List<Integer> playedGames = gameRepository.findAll().stream().map(game -> game.get_id()).collect(Collectors.toList());
//
////        List<Integer> playersPlayed = playerStatsRepository.getAll(sport).stream().filter(stats -> playedGames.contains(stats.getGameId())).map(stats -> stats.getPlayerId()).collect(Collectors.toList());
//        List<Game> gamesPlayed = gameRepository.findByDate(date);
//
//        List<PlayerStats> playerStatsOnDate = playerStatsRepository.findAll().stream().filter(stats -> gamesPlayed.contains(stats.getGame_id())).collect(Collectors.toList());
//
//        //List<Player> listOfPlayersAtGame = playerRepository.findAll().stream().filter(player -> playerStatsOnDate.contains(player.getId())).collect(Collectors.toList());
//
//        for (PlayerStats playerStat : playerStatsOnDate) {
//
//            Player player = playerRepository.findById(playerStat.getPlayer_id());
//            PlayerStatsDto playerStatsDto = new PlayerStatsDto();
//        }
//
//
//
//
//         return dataModels.get(sport).values().stream().filter(player -> playersPlayed.contains(player.getId())).collect(Collectors.toList());
//        return playerRepository.findAll();
//    }

    //Retrieve operation
    public Player getById(int id){
        return playerRepository.findById(id);
    }
}
