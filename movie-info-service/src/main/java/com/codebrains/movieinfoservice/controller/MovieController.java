package com.codebrains.movieinfoservice.controller;

import com.codebrains.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private List<Movie> movies = Arrays.asList(
            new Movie(1200, "KGF", "Good movie", 1234),
            new Movie(1300, "SSF", "Good movie", 2345),
            new Movie(1400, "Googly", "Good movie", 1234)
    );

    @GetMapping(value = "/userId/{userId}")
    public List<Movie> getAllMovieInfo(@PathVariable int userId) {
        return movies.stream()
                .filter(movie -> movie.getUserId() == userId)
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/userId/{userId}/movieId/{movieId}")
    public List<Movie> getMovieInfo(@PathVariable int userId, @PathVariable int movieId) {
        return movies.stream()
                .filter(
                        movie -> movie.getMovieId() == movieId
                                && movie.getUserId() == userId
                )
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/movies")
    public List<String> getMovies() {
        return movies.stream()
                .map(Movie::getMovieName)
                .collect(Collectors.toList());
    }
}
