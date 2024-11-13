package com.enterprise.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	

}
