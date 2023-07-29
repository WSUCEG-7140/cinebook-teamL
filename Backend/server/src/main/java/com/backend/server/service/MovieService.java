/**
 * @file MovieService.java
 * This file contains the MovieService interface, which defines service methods related to movies.
 */

package com.backend.server.service;

import com.backend.server.Model.Movies;

import java.util.List;

/**
 * @interface MovieService
 * This interface represents the service for movie-related operations.
 */
public interface MovieService {

    /**
     * Get a list of all movies.
     *
     * @return A list of Movies objects representing all movies in the system.
     */
    List<Movies> getAllMovies();

    /**
     * Add a list of movies to the system.
     *
     * @param movies The list of Movies objects to be added.
     * @return The list of Movies objects that were successfully added.
     */
    List<Movies> addAllMovies(List<Movies> movies);

    /**
     * Add a movie to the system.
     *
     * @param movie The Movies object representing the movie to be added.
     * @return The Movies object representing the newly added movie.
     */
    Movies addMovie(Movies movie);

    /**
     * Find movies by their status (e.g., TRENDING, NEW).
     *
     * @param status The status of the movies to retrieve.
     * @return A list of Movies objects representing movies with the given status.
     */
    List<Movies> findByStatus(String status);

    /**
     * Update movie information in the system.
     *
     * @param movie The Movies object representing the updated movie information.
     * @return The Movies object representing the updated movie.
     */
    Movies updateMovie(Movies movie);

    /**
     * Find movies by their genre.
     *
     * @param gener The genre of the movies to retrieve.
     * @return A list of Movies objects representing movies with the given genre.
     */
    List<Movies> findByGener(String gener);

    /**
     * Delete a movie from the system.
     *
     * @param movie The Movies object representing the movie to be deleted.
     */
    void deleteMovie(Movies movie);
}
