/**
 * @file CurrentUserDetails.java
 * This file contains the CurrentUserDetails class, which implements UserDetailsService for Spring Security.
 */

package com.backend.server.service;

import com.backend.server.Model.User;
import com.backend.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @class CurrentUserDetails
 * This class represents a custom UserDetailsService implementation for Spring Security.
 * It is responsible for loading user details based on the provided username during authentication.
 */
@Service
public class CurrentUserDetails implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Loads user details based on the provided username during authentication.
     *
     * @param username The username (in this case, mobile number) of the user to be loaded.
     * @return The UserDetails object representing the user with the given username.
     * @throws UsernameNotFoundException If the user with the provided username is not found in the repository.
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Find the user by their mobile number (username) in the repository.
        Optional<User> user = userRepository.findById(username);

        // If the user is not found, throw an exception indicating the user was not found.
        if (!user.isPresent()) {
            throw new UsernameNotFoundException("User not found");
        }

        // Create and return a new CurrentUser instance with the found user details.
        return new CurrentUser(user);
    }
}
