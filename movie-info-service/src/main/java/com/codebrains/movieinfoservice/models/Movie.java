package com.codebrains.movieinfoservice.models;

public class Movie {

    private int movieId;
    private String movieName;
    private String description;
    private int userId;

    public Movie() {}

    public Movie(int movieId, String movieName, String description, int userId) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.description = description;
        this.userId = userId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
