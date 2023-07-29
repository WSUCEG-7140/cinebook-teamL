/**
 * @file CurrentUser.java
 * This file contains the CurrentUser class, which implements UserDetails for Spring Security.
 */

package com.backend.server.service;

import com.backend.server.Model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

/**
 * @class CurrentUser
 * This class represents a custom UserDetails implementation for Spring Security.
 * It provides necessary information for authentication and authorization of users.
 */
@Service
public class CurrentUser implements UserDetails {

    private User user;

    /**
     * Constructs a new CurrentUser instance with the provided User object.
     *
     * @param user The User object representing the currently logged-in user.
     */
    public CurrentUser(Optional<User> user) {
        super();
        this.user = user.get();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // In this implementation, we only assign a single authority "USER" to all users.
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getMobileNumber();
    }

    @Override
    public boolean isAccountNonExpired() {
        // In this implementation, we assume that user accounts never expire.
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // In this implementation, we assume that user accounts are never locked.
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // In this implementation, we assume that user credentials never expire.
        return true;
    }

    @Override
    public boolean isEnabled() {
        // In this implementation, we assume that all user accounts are enabled.
        return true;
    }
}
