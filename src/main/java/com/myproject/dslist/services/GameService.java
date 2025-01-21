package com.myproject.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.dslist.dto.GameMinDTO;
import com.myproject.dslist.entities.Game;
import com.myproject.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        //List<GameMinDTO> dto  = result.stream().map(x -> new GameMinDTO(x)).toList();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
