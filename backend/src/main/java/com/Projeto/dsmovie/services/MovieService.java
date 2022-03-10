package com.Projeto.dsmovie.services;
import com.Projeto.dsmovie.dto.MovieDTO;
import com.Projeto.dsmovie.entities.Movie;
import com.Projeto.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class MovieService {

    @Autowired
    public MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public ResponseEntity<Page<MovieDTO>> findAll(Pageable pageable){
        var result = movieRepository.findAll(pageable);
        Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
        return ResponseEntity.status(HttpStatus.OK).body(page);
    }

    public ResponseEntity<MovieDTO> findById(Long id){
        Movie result = movieRepository.findById(id).get();
        MovieDTO dto =  new MovieDTO(result);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }




}
