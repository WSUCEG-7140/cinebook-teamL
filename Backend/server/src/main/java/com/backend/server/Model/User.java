/**
 * @file User.java
 * This file contains the User class, which represents a model for users in the application.
 */

package com.backend.server.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @class User
 * This class represents a model for users in the application.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "user")
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    /**
     * The email address of the user.
     */
    private String email;

    /**
     * The first name of the user.
     */
    private String firstName;

    /**
     * The last name of the user.
     */
    private String lastName;

    /**
     * The unique identifier for the user, which is the mobile number in this case.
     */
    @Id
    private String mobileNumber;

    /**
     * The password of the user.
     */
    private String password;

    // The following field has been commented out, but it's present in the class.

    // /**
    //  * The cart representing the user's inventory.
    //  */
    // private List<Inventory> cart = new ArrayList<>();

    /**
     * The address of the user.
     */
    private String Address;

    /**
     * The role of the user (e.g., admin, customer, etc.).
     */
    private String role;
}
