package com.movies.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.movies.model.MovieModel;

public interface MovieService {
    public String addMovie(MovieModel movie);

    public MovieModel updateMovie(MovieModel movie);

    public MovieModel getMovie(String moviedId);

    public List<MovieModel> getMovies();

    @Query(value = "select * from movie m where m.title like %:keyword% ",nativeQuery = true)
    public List<MovieModel> findByTitle(@Param("keyword") String keyword);

    public String deleteMovie(String movieId);

    
    
}


