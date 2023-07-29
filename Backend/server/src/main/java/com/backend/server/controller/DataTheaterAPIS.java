/**
 * @file DataTheaterAPIS.java
 * This file contains the DataTheaterAPIS class, which is a Spring Boot controller
 * responsible for handling movie-related API endpoints.
 */

package com.backend.server.controller;

import com.backend.server.Model.Movies;
import com.backend.server.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @class DataTheaterAPIS
 * This class represents the Spring Boot controller for movie-related API endpoints.
 * It handles HTTP requests related to movies.
 */
@RestController
@RequestMapping("/movies")
@CrossOrigin(origins = "http://localhost:3000")
public class DataTheaterAPIS {

    @Autowired
    private MovieService movieService;

    /**
     * Retrieve all movies from the database.
     *
     * @return A list of Movies objects representing all movies in the database.
     */
    @GetMapping(value = "/getAllMovies", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movies> getAllMovies() {
        return movieService.getAllMovies();
    }

    /**
     * Retrieve movies based on their status (e.g., TRENDING, NEW).
     *
     * @param status The status of the movies to retrieve.
     * @return A list of Movies objects representing movies with the given status.
     */
    @GetMapping(value = "/getByStatus")
    public List<Movies> getByStatus(@RequestParam String status) {
        return movieService.findByStatus(status);
    }

    /**
     * Save a list of movies to the database.
     *
     * @param movies The list of Movies objects to be saved.
     */
    @PostMapping("/addAllMovies")
    public void saveAllMovies(@RequestBody List<Movies> movies) {
        movieService.addAllMovies(movies);
    }

    /**
     * Add a new movie to the database.
     *
     * @param movie The Movies object representing the movie to be added.
     * @return The Movies object representing the newly added movie.
     */
    @PostMapping("/addMovie")
    public Movies addMovie(@RequestBody Movies movie) {
        return movieService.addMovie(movie);
    }
}
