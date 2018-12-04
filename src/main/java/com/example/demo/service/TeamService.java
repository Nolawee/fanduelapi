package com.example.demo.service;

import com.example.demo.model.Teams;
import com.example.demo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
   
	@Autowired
	private TeamRepository teamRepository;

	//Retrieve operation
	public List<Teams> getAll(){
		return teamRepository.findAll();
	}

	//Retrieve operation
	public Teams getById(int id){
		return teamRepository.findById(id);
	}

}
