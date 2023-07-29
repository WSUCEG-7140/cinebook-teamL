/**
 * @file MovieServiceImpl.java
 * This file contains the MovieServiceImpl class, which implements the MovieService interface.
 * It provides service methods related to movies and interacts with the MovieRepository.
 */

package com.backend.server.service;

import com.backend.server.Model.Movies;
import com.backend.server.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @class MovieServiceImpl
 * This class represents the implementation of the MovieService interface.
 * It provides service methods for movie-related operations and interacts with the MovieRepository.
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    /**
     * Get a list of all movies.
     *
     * @return A list of Movies objects representing all movies in the system.
     */
    @Override
    public List<Movies> getAllMovies() {
        // Get all movies from the repository.
        List<Movies> movies = movieRepository.findAll();

        // Print the size of the retrieved movie list (for debugging purposes).
        System.out.println(movies.size());

        // Return the list of movies.
        return movies;
    }

    /**
     * Add a list of movies to the system.
     *
     * @param movies The list of Movies objects to be added.
     * @return The list of Movies objects that were successfully added.
     */
    @Override
    public List<Movies> addAllMovies(List<Movies> movies) {
        // Save all movies to the repository.
        return movieRepository.saveAll(movies);
    }

    /**
     * Add a movie to the system.
     *
     * @param movie The Movies object representing the movie to be added.
     * @return The Movies object representing the newly added movie.
     */
    @Override
    public Movies addMovie(Movies movie) {
        // Save a movie to the repository.
        Movies mv = movieRepository.save(movie);

        // Return the saved movie.
        return mv;
    }

    /**
     * Update movie information in the system.
     *
     * @param movie The Movies object representing the updated movie information.
     * @return The Movies object representing the updated movie.
     */
    @Override
    public Movies updateMovie(Movies movie) {
        // Save a movie (update if exists) to the repository.
        Movies mv = movieRepository.save(movie);

        // Return the saved movie.
        return mv;
    }

    /**
     * Find movies by their
