package com.example.movies.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.movies.model.Movie;
import com.example.movies.repository.IMovieRepository;

@Service
public class MovieService {
    private final IMovieRepository movieRepository;

    public MovieService(IMovieRepository movieRepository) {

        this.movieRepository = movieRepository;
    }

    public List<Movie> getAll()
    {

        return movieRepository.getAll();
    }

    public Movie get(String movieId)
    {

        return movieRepository.get(movieId);
    }


    public Movie addMovie(Movie movie)
    {
        movie.setMovieId(null);
        return movieRepository.save(movie);
    }

    public Movie updateMovie(String movieId, Movie movie)
    {
        Movie movieR = movieRepository.get(movieId);
        if (movieR == null) {
            return null;
        }
        movie.setMovieId(movieId);
        return movieRepository.save(movie);
    }
    
    public Movie deleteMovie(String movieId)
    {
        return movieRepository.delete(movieId);
    
    }
}

