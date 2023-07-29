/**
 * @file MovieRepository.java
 * This file contains the MovieRepository interface, which represents a repository for movie entities in the database.
 */

package com.backend.server.repository;

import com.backend.server.Model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @interface MovieRepository
 * This interface represents a repository for movie entities in the database.
 * It extends the MongoRepository interface, providing basic CRUD operations for Movies.
 */
@Repository
public interface MovieRepository extends MongoRepository<Movies, Integer> {

    /**
     * Retrieve movies based on their status (e.g., TRENDING, NEW).
     *
     * @param status The status of the movies to retrieve.
     * @return A list of Movies objects representing movies with the given status.
     */
    List<Movies> findByStatus(String status);

    // Additional comments:
    // The findByStatus method allows querying movies based on their status.
    // The status parameter is used to filter movies with a particular status (e.g., TRENDING).
    // The method returns a list of Movies objects that match the given status.
    // It utilizes the Spring Data MongoDB query generation based on the method name.
    // The method name "findByStatus" instructs Spring Data MongoDB to generate a query to find movies by their status.
    // The returned list may contain multiple movies with the same status.
    // If no movies match the given status, an empty list will be returned.
}
