/**
 * @file TheaterService.java
 * This file contains the TheaterService interface, which defines service methods related to theaters.
 */

package com.backend.server.service;

import com.backend.server.Model.User;

import java.util.Optional;

/**
 * @interface TheaterService
 * This interface represents the service for theater-related operations.
 */
public interface TheaterService {

    /**
     * Add a new user to the system.
     *
     * @param user The User object representing the user to be added.
     * @return The User object representing the newly added user.
     */
    public User addUser(User user);

    /**
     * Get a user by their email address.
     *
     * @param email The email address of the user to retrieve.
     * @return An Optional containing the User object if found, or empty if not found.
     */
    public Optional<User> getUser(String email);

    /**
     * Update user information in the system.
     *
     * @param user The User object representing the updated user information.
     * @return The User object representing the updated user.
     */
    User updateUser(User user);

    /**
     * Delete a user from the system by their mobile number.
     *
     * @param mobileNumber The mobile number of the user to be deleted.
     * @return A message indicating the success or failure of the deletion process.
     */
    String deleteUser(String mobileNumber);

    // The following method has been commented out, but it's present in the class.

    // /**
    //  * Add an item to the user's cart (inventory) in the system.
    //  *
    //  * @param inventory The Inventory object representing the item to be added to the cart.
    //  * @return The updated Inventory object representing the user's cart after adding the item.
    //  */
    // Inventory addItemToCart(Inventory inventory);

    /**
     * Get the number of available tickets for a theater.
     *
     * @param theaterId The identifier of the theater for which to get the available tickets.
     * @return The number of available tickets for the specified theater.
     */
    int getAvailableTickets(int theaterId);
}
