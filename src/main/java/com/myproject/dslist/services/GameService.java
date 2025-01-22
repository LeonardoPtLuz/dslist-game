package com.myproject.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.dslist.dto.GameDTO;
import com.myproject.dslist.dto.GameMinDTO;
import com.myproject.dslist.entities.Game;
import com.myproject.dslist.repositories.GameRepository;

import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        //GameDTO dto = new GameDTO(result);
        return new GameDTO(result);
    }


    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        //List<GameMinDTO> dto  = result.stream().map(x -> new GameMinDTO(x)).toList();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
