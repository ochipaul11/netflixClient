package com.client.netflixclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.List;
@Component
public class RestTesting implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Genre genre1 = new Genre("Action");
        Genre genre2 = new Genre("Horror");
        Genre genre3 = new Genre("comedy");
        Genre genre4 = new Genre("Fantasy");
        Genre genre5 = new Genre("Thriller");
        Genre genre6 = new Genre("Romance");
        Genre genre7 = new Genre("Drama");

        RestTemplate restTemplate = new RestTemplate();
/*
    GETTING A LIST OF ALL THE MOVIES IN SERVER
 */
        ResponseEntity<List<Movie>> responseEntity = restTemplate.exchange(
                "http://localhost:9090/movie",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Movie>>() {
                }) ;
        System.err.println("All Movies in Netflix-------------");
        List<Movie> movies = responseEntity.getBody();
        for(Movie movie: movies) {

            System.out.println(movie.toString());
            movie.genreToString();

        }
/*
  ADDING A CLIENT TO THE SERVER
 */
        Client client1 = new Client((long) 20131,"Paul Kamau");
        Client createdClient1 = restTemplate.postForObject("http://localhost:9090/client",client1,Client.class);
        System.err.println("Creating a client ----------------------");
        System.out.println(createdClient1.toString());
/*
 ADDING ONE SUGGESTED MOVIE TO THE SERVER BY THE CLIENT
 */
       System.err.println("Adding Movie ----------------------");
        Movie movie1 = new Movie("Avengers","Suggested");
        movie1.addMovieGenre(genre1);
        movie1.addMovieGenre(genre3);
        Movie createdMovie = restTemplate.postForObject("http://localhost:9090/client/14/addMovie/3/4",movie1,Movie.class);
        System.out.println(createdMovie.toString());
        System.out.println(genre1.toStrings());
        System.out.println(genre3.toStrings());
/*
GETTING AN UPDATED LIST OF THE MOVIES IN THE SERVER
 */

        ResponseEntity<List<Movie>> responseEntity2 = restTemplate.exchange(
                "http://localhost:9090/movie",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Movie>>() {
                }) ;
        System.err.println("All Movies in Netflix Originals and user Recommendations-------------");
        List<Movie> updatedMovies = responseEntity2.getBody();
        for(Movie movie: movies) {

            System.out.println(movie.toString());
            movie.genreToString();

        }



    }
}
