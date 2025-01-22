package com.myproject.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.dslist.dto.GameListDTO;
import com.myproject.dslist.entities.GameList;
import com.myproject.dslist.repositories.GameListRepository;

import org.springframework.transaction.annotation.Transactional;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        //List<GameMinDTO> dto  = result.stream().map(x -> new GameMinDTO(x)).toList();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
