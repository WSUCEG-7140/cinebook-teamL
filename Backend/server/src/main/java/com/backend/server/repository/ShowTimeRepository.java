/**
 * @file ShowTimeRepository.java
 * This file contains the ShowTimeRepository interface, which extends the MongoRepository for managing ShowTime entities.
 */

package com.backend.server.repository;

import com.backend.server.Model.ShowTime;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @interface ShowTimeRepository
 * This interface represents a repository for managing ShowTime entities.
 * It extends the MongoRepository interface, which provides basic CRUD operations for the ShowTime model.
 */
@Repository
public interface ShowTimeRepository extends MongoRepository<ShowTime, Integer> {
    // The interface body is empty as it inherits all the necessary methods from MongoRepository.
    // However, you can add custom query methods here if needed.
}
