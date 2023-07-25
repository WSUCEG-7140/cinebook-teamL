import React, { useState } from 'react';

function TicketPage() {
  const [movie, setMovie] = useState('');
  const [ticketQuantity, setTicketQuantity] = useState(1);
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');

  const movies = [
    { id: 1, title: 'Movie 1' },
    { id: 2, title: 'Movie 2' },
    { id: 3, title: 'Movie 3' }
  ];

  const handleMovieChange = (event) => {
    setMovie(event.target.value);
  };

  const handleTicketQuantityChange = (event) => {
    setTicketQuantity(Number(event.target.value));
  };

  const handleNameChange = (event) => {
    setName(event.target.value);
  };

  const handleEmailChange = (event) => {
    setEmail(event.target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();

    // Process the ticket booking data, e.g., make an API call

    // Reset the form after submission
    setMovie('');
    setTicketQuantity(1);
    setName('');
    setEmail('');
  };

  return (
    <div>
      <h1>Book Movie Tickets</h1>
      <form onSubmit={handleSubmit}>
        <label>
          Select Movie:
          <select value={movie} onChange={handleMovieChange}>
            <option value="">Select a movie</option>
            {movies.map((movie) => (
              <option key={movie.id} value={movie.title}>
                {movie.title}
              </option>
            ))}
          </select>
        </label>
        <br />
        <label>
          Number of Tickets:
          <input type="number" min="1" value={ticketQuantity} onChange={handleTicketQuantityChange} />
        </label>
        <br />
        <label>
          Name:
          <input type="text" value={name} onChange={handleNameChange} />
        </label>
        <br />
        <label>
          Email:
          <input type="email" value={email} onChange={handleEmailChange} />
        </label>
        <br />
        <button type="submit">Book Tickets</button>
      </form>
    </div>
  );
}

export default TicketPage;
