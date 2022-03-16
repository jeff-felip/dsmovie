package com.Projeto.dsmovie.controllers;


import com.Projeto.dsmovie.dto.MovieDTO;
import com.Projeto.dsmovie.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping()
    public ResponseEntity<Page<MovieDTO>> findAllMovies(Pageable pageable){
        return movieService.findAllPage(pageable);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<MovieDTO> findMovie(@PathVariable Long id, Pageable page){
        return movieService.findById(id, page);
    }

}
