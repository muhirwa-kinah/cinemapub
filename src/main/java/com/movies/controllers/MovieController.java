package com.movies.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.model.MovieModel;
import com.movies.services.MovieService;



@RestController
@RequestMapping("/api")
@CrossOrigin

public class MovieController {


    MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService=movieService;
    }




    @GetMapping("/{movieId}")
    public MovieModel get(@PathVariable("movieId") String movieId) {
        return movieService.getMovie(movieId);
    }
    @GetMapping("/allMovies")
    public List<MovieModel> getAll(MovieModel movie) {
        return movieService.getMovies();
    }
    @GetMapping("/search/{title}")
    public List<MovieModel> search(@PathVariable("title") String title) {
        return movieService.findByTitle(title);
    }
    @PostMapping("/addMovie")
    public String addMovie(@RequestBody MovieModel movie) {
        movieService.addMovie(movie);
        return "Success";  
    }
    @Transactional
    @DeleteMapping("/{movieId}")
    public String deleteMovie(@PathVariable("movieId") String movieId)
    {
        movieService.deleteMovie(movieId);
        return "Deleted Successfully";
    }
    @PutMapping("/updateMovie")
    public MovieModel updateMovie(@RequestBody MovieModel movie)
    {
        movieService.updateMovie(movie);
       return movie;
    }
}
