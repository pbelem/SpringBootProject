package com.enterprise.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.enterprise.dslist.dto.GameMinDTO;
import com.enterprise.dslist.entities.Game;
import com.enterprise.dslist.repositories.GameRepository;

@Component
//@Service is a nickname for Component
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
//		the code below could be "var result = gameRepository.findAll();" too
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
