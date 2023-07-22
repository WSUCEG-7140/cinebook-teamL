import React, { useState } from 'react';

function TicketHistory() {
  const [ticketHistory, setTicketHistory] = useState([]);

  const handleTicketBooking = (ticket) => {
    // Simulate booking a ticket and adding it to the history
    const bookingDate = new Date().toLocaleDateString();
    const bookingTime = new Date().toLocaleTimeString();
    const newTicket = {
      ticket: ticket,
      date: bookingDate,
      time: bookingTime,
      status: 'Booked'
    };
    const newTicketHistory = [...ticketHistory, newTicket];
    setTicketHistory(newTicketHistory);
  };

  return (
    <div>
      <h1>Ticket Booking History</h1>
      <button onClick={() => handleTicketBooking('Ticket 1')}>Book Ticket 1</button>
      <button onClick={() => handleTicketBooking('Ticket 2')}>Book Ticket 2</button>
      <button onClick={() => handleTicketBooking('Ticket 3')}>Book Ticket 3</button>
      {ticketHistory.length > 0 ? (
        <table>
          <thead>
            <tr>
              <th>Ticket</th>
              <th>Date</th>
              <th>Time</th>
              <th>Status</th>
            </tr>
          </thead>
          <tbody>
            {ticketHistory.map((ticket, index) => (
              <tr key={index}>
                <td>{ticket.ticket}</td>
                <td>{ticket.date}</td>
                <td>{ticket.time}</td>
                <td>{ticket.status}</td>
              </tr>
            ))}
          </tbody>
        </table>
      ) : (
        <p>No tickets booked yet.</p>
      )}
    </div>
  );
}

export default TicketHistory;
