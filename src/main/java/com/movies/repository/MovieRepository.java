package com.movies.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.model.MovieModel;

public interface MovieRepository extends JpaRepository<MovieModel, String> {

    List<MovieModel> findByTitle(String keyword);
    void deleteBymovieId(String movieId);
    
  
}
