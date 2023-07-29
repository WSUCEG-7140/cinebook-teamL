/**
 * @file TicketsRepository.java
 * This file contains the TicketsRepository interface, which extends MongoRepository to provide CRUD operations for the Movies collection in the database.
 */

package com.backend.server.repository;

import com.backend.server.Model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @interface TicketsRepository
 * This interface represents the repository for the Movies collection in the database.
 * It extends MongoRepository to provide CRUD operations for the Movies collection.
 */
@Repository
public interface TicketsRepository extends MongoRepository<Movies, Integer> {

    /**
     * Retrieve movies based on their status.
     *
     * @param status The status of the movies to retrieve.
     * @return A list of Movies objects representing movies with the given status.
     */
    List<Movies> findByStatus(String status);

    // Additional comments (not related to Doxygen):
    // The method name "findByStatus" follows the Spring Data JPA naming convention, and it automatically generates
    // the appropriate query to find movies by their status field. The implementation of this method is provided by
    // Spring Data, and it allows us to retrieve movies based on their status directly from the database without
    // writing custom queries.
    //
    // The "@Repository" annotation is used to indicate that this interface is a Spring Data repository and should be
    // automatically detected by Spring during component scanning. It allows us to leverage the power of Spring Data
    // for our database operations.
}
