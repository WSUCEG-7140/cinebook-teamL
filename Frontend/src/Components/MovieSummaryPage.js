import React from 'react';
import './MovieSummaryPage.css'; // Import the CSS file for MovieSummaryPage

function MovieSummaryPage() {
  // Sample movie data (replace with actual movie data from your backend or API)
  const movie = {
    title: 'Sample Movie',
    poster: 'https://via.placeholder.com/200x300', // Placeholder image URL
    releaseDate: '2023-07-04',
    summary:
      'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eget aliquam justo, a sollicitudin enim.'
  };

  return (
    <div className="movie-summary-container">
      <div className="movie-poster">
        <img src={movie.poster} alt={movie.title} />
      </div>
      <div className="movie-details">
        <h1>{movie.title}</h1>
        <p>Release Date: {movie.releaseDate}</p>
        <p className="movie-summary">{movie.summary}</p>
      </div>
    </div>
  );
}

export default MovieSummaryPage;
