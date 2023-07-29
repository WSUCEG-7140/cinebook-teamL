/**
 * @file TicketTableRepository.java
 * This file contains the TicketTableRepository interface, which provides data access methods
 * for interacting with the "movies" collection in the MongoDB database.
 */

package com.backend.server.repository;

import com.backend.server.Model.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @interface TicketTableRepository
 * This interface extends MongoRepository and provides data access methods for the "movies" collection.
 * The TicketTableRepository is responsible for performing CRUD operations on movie data in the database.
 * It is marked as a Spring Data repository and allows us to work with MongoDB using high-level abstraction.
 */
@Repository
public interface TicketTableRepository extends MongoRepository<Movies, Integer> {

    /**
     * Find movies by their status.
     *
     * @param status The status of the movies to search for (e.g., "TRENDING", "NEW").
     * @return A list of Movies objects representing movies with the given status.
     */
    List<Movies> findByStatus(String status);
}
