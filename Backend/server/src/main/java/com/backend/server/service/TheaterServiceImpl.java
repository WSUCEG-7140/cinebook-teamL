/**
 * @file TheaterServiceImpl.java
 * This file contains the TheaterServiceImpl class, which implements the UserService interface.
 * It provides service methods related to users and interacts with the UserRepository.
 */

package com.backend.server.service;

import com.backend.server.Model.User;
import com.backend.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @class TheaterServiceImpl
 * This class represents the implementation of the UserService interface.
 * It provides service methods for user-related operations and interacts with the UserRepository.
 */
@Service
public class TheaterServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Add a new user to the system.
     *
     * @param user The User object representing the user to be added.
     * @return The User object representing the newly added user.
     */
    @Override
    public User addUser(User user) {
        // Encrypt the user's password using BCryptPasswordEncoder before saving it to the repository.
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));

        // Save the user to the repository.
        return userRepository.save(user);
    }

    /**
     * Get a user by their mobile number.
     *
     * @param mobileNumber The mobile number of the user to retrieve.
     * @return An Optional containing the User object if found, or empty if not found.
     */
    @Override
    public Optional<User> getUser(String mobileNumber) {
        // Find a user by their mobile number in the repository.
        return userRepository.findById(mobileNumber);
    }

    /**
     * Update user information in the system.
     *
     * @param user The User object representing the updated user information.
     * @return The User object representing the updated user.
     */
    @Override
    public User updateUser(User user) {
        // Save a user (update if exists) to the repository.
        return userRepository.save(user);
    }

    /**
     * Delete a user from the system by their mobile number.
     *
     * @param mobileNumber The mobile number of the user to be deleted.
     * @return A message indicating the success or failure of the deletion process.
     */
    @Override
    public String deleteUser(String mobileNumber) {
        // Delete a user from the repository by their mobile number.
        userRepository.deleteById(mobileNumber);
        return "UserDeleted Successfully";
    }

    /**
     * Get the number of available tickets for a theater.
     *
     * @param theaterId The identifier of the theater for which to get the available tickets.
     * @return The number of available tickets for the specified theater.
     */
    @Override
    public int getAvailableTickets(int theaterId) {
        // Get the number of available seats (tickets) for the specified theater from the repository.
        return userRepository.getById(theaterId).getSeatsAvailable();
    }

    // The following method has been commented out, but it's present in the class.

    // /**
    //  * Add an item to the user's cart (inventory) in the system.
    //  *
    //  * @param inventory The Inventory object representing the item to be added to the cart.
    //  * @return The updated Inventory object representing the user's cart after adding the item.
    //  */
    // @Override
    // public Inventory addItemToCart(Inventory inventory) {
    //     user.getCart().add(inventory);
    //     return inventory;
    // }

}
