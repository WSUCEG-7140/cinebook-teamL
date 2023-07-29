/**
 * @file TicketTable.java
 * This file contains the TicketTable class, which represents a model for movie tickets in a database table.
 */

package com.backend.server.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @class TicketTable
 * This class represents a model for movie tickets in a database table.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "tickets")
public class TicketTable {

    /**
     * The unique identifier for the ticket in the database table.
     */
    @Id
    private int ticketId;

    /**
     * The unique identifier for the movie associated with the ticket in the database table.
     */
    private int movieId;

    /**
     * The name of the movie associated with the ticket in the database table.
     */
    private String movieName;

    /**
     * The name of the theater where the movie ticket is valid in the database table.
     */
    private String theatre;
}
