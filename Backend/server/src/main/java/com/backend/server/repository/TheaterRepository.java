/**
 * @file TheaterRepository.java
 * This file contains the TheaterRepository interface, which provides access to movie data stored in a MongoDB database.
 */

package com.backend.server.repository;

import com.backend.server.Model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @interface TheaterRepository
 * This interface provides access to movie data stored in a MongoDB database.
 */
@Repository
public interface TheaterRepository extends MongoRepository<Movies, Integer> {

    /**
     * Find movies by their status (e.g., TRENDING, NEW, UPCOMING).
     *
     * @param status The status of the movies to search for.
     * @return A list of Movies objects representing movies with the given status.
     */
    List<Movies> findByStatus(String status);

}
