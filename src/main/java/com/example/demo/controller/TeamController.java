package com.example.demo.controller;

import com.example.demo.model.Teams;
import com.example.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;

	@RequestMapping("/nba/teams")
	public List<Teams> getAll(){
		return teamService.getAll();
	}

	@RequestMapping("/nba/teams/{id}")
	public Teams getbyId(@PathVariable String id){
		int teamId = Integer.parseInt(id);
		return teamService.getById(teamId);
	}
	
}
