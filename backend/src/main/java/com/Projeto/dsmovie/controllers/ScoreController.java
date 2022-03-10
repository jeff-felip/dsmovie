package com.Projeto.dsmovie.controllers;


import com.Projeto.dsmovie.dto.MovieDTO;
import com.Projeto.dsmovie.dto.ScoreDTO;
import com.Projeto.dsmovie.services.MovieService;
import com.Projeto.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public ResponseEntity<MovieDTO> saveScore(@RequestBody ScoreDTO scoreDTO) {
        MovieDTO dto = scoreService.saveScore(scoreDTO);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

}
