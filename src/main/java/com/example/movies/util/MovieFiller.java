package com.example.movies.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.movies.model.Movie;
import com.example.movies.service.MovieService;

@Component
public class MovieFiller {

    private final MovieService movieService;
    
    public MovieFiller(MovieService movieService){
        this.movieService = movieService;
    }

    @PostConstruct
    public void init(){
        Movie movie1 =  new Movie("La escuela del bien y del mal", "Sophie y Agatha son dos amigas que se encuentran en lados opuestos de una batalla épica cuando son arrastradas a una escuela encantada. Allí, los aspirantes a héroes y villanos son entrenados para proteger el equilibrio entre el bien y el mal.", "Paul Feig");
        movieService.addMovie(movie1);
        try {Thread.sleep(1000);} catch (InterruptedException e) {}
        Movie movie2 =  new Movie("Como si fuera la primera vez", "Henry, biólogo marino, no tiene la mínima intención de comprometerse con nadie, hasta que conoce a Lucy, la chica de sus sueños. Sin embargo, hay un pequeño problema, la joven se levanta cada mañana sin recordar absolutamente nada del día anterior.", "Peter Segal");
        movieService.addMovie(movie2);
        try {Thread.sleep(1000);} catch (InterruptedException e) {}
        Movie movie3 =  new Movie("Encantada", "Giselle, la princesa de un cuento de hadas, es desterrada por una reina malvada y termina en el Manhattan moderno, en donde la música, la magia y los finales felices no son muy frecuentes. Giselle se siente extraña en su nuevo mundo, hasta que un abogado divorciado llega para ayudarla. Giselle empieza a enamorarse de su benefactor, pero el romance de su libro de cuentos se complica más cuando un príncipe de su mundo llega a rescatarla.", "Kevin Lima");
        movieService.addMovie(movie3);
        try {Thread.sleep(1000);} catch (InterruptedException e) {}
    }
}
