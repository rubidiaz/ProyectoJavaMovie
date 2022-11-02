package com.example.movies.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Movie {
   // public Movie(String string, String string2) {
    //}
    private String movieId;
    private String tittle;
    private String description;
    private String director;

    public Movie(String tittle, String description, String director) {
        this.tittle = tittle;
        this.description = description;
        this.director = director;
    }

}
