package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@RestController
@RequestMapping(value = "/games")
public class GameController {


	@Autowired
	private GameRepository gameRepository;

	public List<Game> findAll(){
		List<Game> result = gameRepository.findAll();
		return result;
	}


}
