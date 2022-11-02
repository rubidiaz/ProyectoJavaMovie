package com.example.movies.repository;

import java.util.List;

import com.example.movies.model.Movie;

public interface IMovieRepository {
     List<Movie> getAll();
     Movie get(String movieId);
     Movie save(Movie movie);
     Movie delete(String movieId);
}
