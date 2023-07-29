/**
 * @file Tickets.java
 * This file contains the Tickets class, which represents a model for movie tickets.
 */

package com.backend.server.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @class Tickets
 * This class represents a model for movie tickets.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "tickets")
public class Tickets {

    /**
     * The unique identifier for the ticket.
     */
    @Id
    private int ticketId;

    /**
     * The unique identifier for the movie associated with the ticket.
     */
    private int movieId;

    /**
     * The name of the movie associated with the ticket.
     */
    private String movieName;

    /**
     * The name of the theater where the movie ticket is valid.
     */
    private String theatre;
}
