package com.client.netflixclient;

import java.util.List;

public class Genre {


    Long id;
    String genreName;
    private List<Movie> movies;

    public Genre() {
    }

    public Genre(String genreName) {
        this.genreName = genreName;
    }

    public Genre(String GenreName, List<Movie> movies) {
        this.genreName = GenreName;
        this.movies = movies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString(){


        return "genre" +
                "{genreName='" + genreName + '\'' +
                '}';
    }
}
