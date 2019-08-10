package com.client.netflixclient;

import java.util.ArrayList;
import java.util.List;

public class Client {

    int id;
    Long identificationNumber;
    String clientName;

    private List<Movie> movies = new ArrayList<>();

    public Client() {
    }

    public Client(Long identificationNumber, String clientName) {
        this.identificationNumber = identificationNumber;
        this.clientName = clientName;
    }

    /*  public Client(int identificationNumber, String clientName, Set<Movie> movie) {
          this.identificationNumber = identificationNumber;
          this.clientName = clientName;
          this.movie = movie;
      }
  */
    public int getId() {
        return id;
    }

    //public void setId(int id) {
    //    this.id = id;
    //}

    public Long getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(Long identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public List<Movie> getMovie() {
        return movies;
    }

    public void setMovie(List<Movie> movie) {
        this.movies = movie;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public String toString() {
        return "Client{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", identificationNumber='" + identificationNumber + '\'' +
                '}';
    }
}
