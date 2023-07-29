/**
 * This class represents the REST API controller for managing movie-related operations.
 * It handles various endpoints related to movies in the theater system.
 */
package com.backend.server.controller;

import com.backend.server.Model.Movies;
import com.backend.server.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This class is a REST controller that handles movie-related API endpoints.
 * The base path for these endpoints is "/movies".
 * It also allows Cross-Origin requests from "http://localhost:3000".
 */
@RestController
@RequestMapping("/movies")
@CrossOrigin(origins = "http://localhost:3000")
public class TheaterApis {

    @Autowired
    MovieService movieService;

    /**
     * Get all the movies available in the theater system.
     *
     * @return A list of Movies objects in JSON format.
     */
    @GetMapping(value = "/getAllMovies", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Movies> getAllMovies() {
        return movieService.getAllMovies();
    }

    /**
     * Get movies by their status (e.g., TRENDING).
     *
     * @param status The status of the movies to filter.
     * @return A list of Movies objects in JSON format that match the given status.
     */
    @GetMapping(value = "/getByStatus")
    public List<Movies> getByStatus(@RequestParam String status) {
        return movieService.findByStatus(status);
    }

    /**
     * Save a list of movies in the theater system.
     *
     * @param movies A list of Movies objects to be added to the system.
     */
    @PostMapping("/addAllMovies")
    public void saveAllMovies(@RequestBody List<Movies> movies) {
        movieService.addAllMovies(movies);
    }

    /**
     * Add a new movie to the theater system.
     *
     * @param movie The Movies object representing the movie to be added.
     * @return The Movies object that has been added to the system.
     */
    @PostMapping("/addMovie")
    public Movies addMovie(@RequestBody Movies movie) {
        return movieService.addMovie(movie);
    }
}
