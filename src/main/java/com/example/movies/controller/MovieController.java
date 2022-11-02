package com.example.movies.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movies.model.Movie;
import com.example.movies.service.MovieService;

@RestController
@RequestMapping({"movie"})
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("")
    public List<Movie> getAll(){
       
        return movieService.getAll();
    }

    @GetMapping("/{movieId}")
    public Movie get(@PathVariable String movieId){
       
        return movieService.get(movieId);
    }

    @PostMapping("")
    public Movie addMovie(@RequestBody Movie movie){

        return movieService.addMovie(movie);
    }

    @PutMapping("/{movieId}")
    public Movie addMovie(@PathVariable String movieId, @RequestBody Movie movie)
    {
        return movieService.updateMovie(movieId, movie);

    }

    @DeleteMapping("/{movieId}")
    public Movie addMovie(@PathVariable String movieId)
    {

        return movieService.deleteMovie(movieId);
    }

}
