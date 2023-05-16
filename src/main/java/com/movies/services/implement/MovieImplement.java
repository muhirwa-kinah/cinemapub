package com.movies.services.implement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.movies.model.MovieModel;
import com.movies.repository.MovieRepository;
import com.movies.services.MovieService;

@Service
public class MovieImplement implements MovieService {
    MovieRepository movieRepository;

    public  MovieImplement(MovieRepository movieRepository) {
         this.movieRepository=movieRepository;
    }

    @Override
    public MovieModel getMovie(String movieId) {
       return movieRepository.findById(movieId).get();
 
    }

    @Override
    public List<MovieModel> getMovies() {
        return movieRepository.findAll();
 
    }
    @Transactional
    @Override
    public List<MovieModel> findByTitle(String keyword){
        return movieRepository.findByTitle(keyword);
    }

    @Override
    public String addMovie(MovieModel movie) {
        movieRepository.save(movie);
        return "Added Succesfully";
    }

    @Override
    public MovieModel updateMovie(MovieModel movie) {
        movieRepository.save(movie);
        return movie;
    }

    @Override
    public String deleteMovie(String movieId) {
       
        movieRepository.deleteBymovieId(movieId);
        return "Deleted";
    }
     
}
