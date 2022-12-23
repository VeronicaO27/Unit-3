package com.javaunit3.springmvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BestMovieService {
    private final Movie movie;
    // recommended by autosuggestion in order to meet the needs for this movie. But why?

//    @Autowired
//    public BestMovieService(Movie movie) {
//        this.movie = movie;
//    }

    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie) {
        this.movie = movie;
    }

    public Movie getBestMovie() {
        return movie;
    }

}