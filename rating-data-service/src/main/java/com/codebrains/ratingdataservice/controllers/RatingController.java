package com.codebrains.ratingdataservice.controllers;

import com.codebrains.ratingdataservice.models.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rating")
public class RatingController {

    private List<Rating> ratings = Arrays.asList(
            new Rating(1234, 1200, 5),
            new Rating(2345, 1300, 4),
            new Rating(1234, 1400, 3),
            new Rating(2345, 1400, 4)
    );

    @GetMapping(value = "/userId/{userId}")
    public List<Rating> getAllMovieInfo(@PathVariable int userId) {
        return ratings.stream()
                .filter(movie -> movie.getUserId() == userId)
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/movieId/{movieId}")
    public List<Rating> getMovieInfo(@PathVariable int movieId) {
        return ratings.stream()
                .filter(movie -> movie.getMovieId() == movieId)
                .collect(Collectors.toList());
    }
}
