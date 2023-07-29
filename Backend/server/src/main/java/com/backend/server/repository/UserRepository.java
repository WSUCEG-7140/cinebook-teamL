/**
 * @file UserRepository.java
 * This file contains the UserRepository interface, which extends MongoRepository for User entities.
 */

package com.backend.server.repository;

import com.backend.server.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @interface UserRepository
 * This interface represents the repository for User entities, extending MongoRepository.
 * It provides CRUD operations and other custom queries for the User entity.
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {

    // No need to add extra comments for the methods provided by MongoRepository,
    // as they are well-documented within the Spring Data MongoDB documentation.
    // However, you can add additional custom query methods below if needed.

    // For example, if you want to add a custom query method to find users by their email:

    /**
     * Find a user by their email address.
     *
     * @param email The email address of the user to find.
     * @return The User object if found, null otherwise.
     */
    User findByEmail(String email);

    // You can add more custom query methods here as needed.
    // The naming convention of the method will automatically create the query for you.
}
