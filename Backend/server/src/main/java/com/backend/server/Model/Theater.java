/**
 * @file Theater.java
 * This file contains the Theater class, which represents a model for movies at a theater.
 */

package com.backend.server.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @class Theater
 * This class represents a movie model for movies being shown at a theater.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "movies")
public class Theater {

    /**
     * The unique identifier for the movie.
     */
    @Id
    private int movieId;

    /**
     * The title of the movie.
     */
    private String title;

    /**
     * The duration of the movie.
     */
    private String duration;

    /**
     * The year of the movie's release.
     */
    private String year;

    /**
     * The URL of the movie's poster.
     */
    private String posterUrl;

    /**
     * The name of the theater where the movie is being shown.
     */
    private String theater;

    /**
     * The status of the movie (e.g., TRENDING, NEW, UPCOMING).
     */
    private String status;

    /**
     * The total number of seats available in the theater for this movie.
     */
    private int seatsCount;
}
