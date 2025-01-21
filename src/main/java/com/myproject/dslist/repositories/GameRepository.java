package com.myproject.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

    

}
