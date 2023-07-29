/**
 * @file MovieApis.java
 * This file contains the MovieApis class, which serves as a Spring Boot REST controller for handling movie-related APIs.
 */

package com.backend.server.controller;

import com.backend.server.Model.Movies;
import com.backend.server.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The MovieApis class is a Spring Boot REST controller that provides APIs for movie operations.
 */
@RestController
@RequestMapping("/movies")
@CrossOrigin(origins = "http://localhost:3000")
public class MovieApis {

    @Autowired
    private MovieService movieService;

    /**
     * Retrieves all movies available in the database.
     *
     * @return A List of Movies representing all available movies.
     */
    @GetMapping(value = "/getAllMovies", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movies> getAllMovies() {
        return movieService.getAllMovies();
    }

    /**
     * Retrieves movies by their status (e.g., "TRENDING").
     *
     * @param status The status of the movies to retrieve.
     * @return A List of Movies matching the specified status.
     */
    @GetMapping(value = "/getByStatus")
    public List<Movies> getByStatus(@RequestParam String status) {
        return movieService.findByStatus(status);
    }

    /**
     * Saves a list of movies to the database.
     *
     * @param movies The list of Movies to be saved.
     */
    @PostMapping("/addAllMovies")
    public void saveAllMovies(@RequestBody List<Movies> movies) {
        movieService.addAllMovies(movies);
    }

    /**
     * Adds a new movie to the database.
     *
     * @param movie The Movie object representing the movie to be added.
     * @return The Movie object after it is successfully added.
     */
    @PostMapping("/addMovie")
    public Movies addMovie(@RequestBody Movies movie) {
        return movieService.addMovie(movie);
    }

    /**
     * Updates an existing movie in the database.
     *
     * @param movie The Movie object representing the updated movie information.
     * @return The updated Movie object.
     */
    @PostMapping("/updateMovie")
    public Movies updateMovie(@RequestBody Movies movie) {
        return movieService.updateMovie(movie);
    }
}
