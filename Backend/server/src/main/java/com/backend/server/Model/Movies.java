/**
 * @file Movies.java
 * This file contains the Movies class, which represents a model for movies.
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
 * This class represents a movie model for the application.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "movies")
public class Movies {

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
     * The theater where the movie is being shown.
     */
    private String theater;

    /**
     * The status of the movie (e.g., TRENDING, NEW, UPCOMING).
     */
    private String status;

    /**
     * The genre of the movie.
     */
    private String genre;
}
