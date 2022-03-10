package com.Projeto.dsmovie.repositories;

import com.Projeto.dsmovie.entities.Score;
import com.Projeto.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
