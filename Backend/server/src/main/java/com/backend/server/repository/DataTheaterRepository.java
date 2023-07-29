/**
 * @file DataTheaterRepository.java
 * This file contains the DataTheaterRepository interface, which extends the MongoRepository for Movies.
 */

package com.backend.server.repository;

import com.backend.server.Model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @interface DataTheaterRepository
 * This interface represents the data access layer for the Movies collection in the database.
 * It extends the MongoRepository interface to perform CRUD operations on the Movies collection.
 */
@Repository
public interface DataTheaterRepository extends MongoRepository<DataTheater, Integer> {

    /**
     * Retrieve movies based on their status (e.g., TRENDING, NEW, UPCOMING).
     *
     * @param status The status of the movies to retrieve.
     * @return A list of Movies objects representing movies with the given status.
     */
    List<Movies> findByStatus(String status);

    // Additional comments:
    // The findByStatus method is provided by Spring Data MongoDB and is automatically implemented.
    // It queries the Movies collection in the database and returns a list of Movies objects
    // whose status matches the provided input.
    // The method name "findByStatus" follows the Spring Data convention for query methods.
    // Spring Data automatically parses the method name and generates the MongoDB query accordingly.
    // If there's no implementation for the method, Spring Data will generate it at runtime.
}
