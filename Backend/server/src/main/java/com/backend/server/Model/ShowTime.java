/**
 * @file Movies.java
 * This file contains the Movies class, which represents a model for movie showtimes.
 */

package com.backend.server.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @class Movies
 * This class represents a model for movie showtimes.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "showtimes")
public class ShowTime {

    /**
     * The unique identifier for the movie showtime.
     */
    @Id
    private int showtime_id;

    /**
     * The start time of the movie showtime.
     */
    private String start_time;

    /**
     * The ID of the theater where the movie showtime is scheduled.
     */
    private int theater_id;

    /**
     * The end time of the movie showtime.
     */
    private String end_time;
}
