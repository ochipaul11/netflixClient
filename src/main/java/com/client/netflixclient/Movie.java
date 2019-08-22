package com.client.netflixclient;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Movie {
    private Long id;
    private String movieName;
    private String movieType;
    private List<Genre> genres = new ArrayList<>();
    private Client client;

    public Movie() {
    }

    public Movie(String movieName, String movieType) {
        this.movieName = movieName;
        this.movieType = movieType;

    }

    public Movie(String movieName, String movieType, Client client) {
        this.movieName = movieName;
        this.movieType = movieType;
        // this.genres = genres;
        this.client = client;
    }

    /* public Movie(String movieName, String movieType, List<Genre> genres, Client client) {
        this.movieName = movieName;
        this.movieType = movieType;
        this.genres = genres;
        this.client = client;
    }
*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addMovieGenre(Genre genre){
        genres.add(genre);
    }

    public void addMovieGenre(Set<Genre> genre) {
        genres.addAll(genre);
    }

    @Override
    public String toString(){

        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", movieType='" + movieType + '\'' +
                      genres.toString() + '\''
                ;
    }
}
