package com.enterprise.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
	

}
