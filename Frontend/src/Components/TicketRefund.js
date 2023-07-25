import React, { useState } from 'react';

function TicketRefund() {
  const [cancelTime, setCancelTime] = useState('');
  const [refundAmount, setRefundAmount] = useState('');

  const handleCancelTimeChange = (event) => {
    setCancelTime(event.target.value);
  };

  const handleCalculateRefund = () => {
    const refundPercentage = 30;
    const fullTicketPrice = 100; // Assuming the ticket price is $100

    // Calculate the refund amount based on the given cancel time
    if (cancelTime !== '') {
      const cancelTimeInMinutes = parseInt(cancelTime, 10);
      const timeBeforeRefundAllowed = 20;
      if (cancelTimeInMinutes >= timeBeforeRefundAllowed) {
        const refund = (refundPercentage / 100) * fullTicketPrice;
        setRefundAmount(refund);
      } else {
        setRefundAmount(0);
      }
    }
  };

  return (
    <div>
      <h1>Ticket Refund Calculator</h1>
      <label>Cancel Time (minutes before showtime):</label>
      <input type="number" value={cancelTime} onChange={handleCancelTimeChange} />
      <button onClick={handleCalculateRefund}>Calculate Refund</button>
      {refundAmount !== '' && (
        <p>
          Refund Amount: ${refundAmount.toFixed(2)}
        </p>
      )}
    </div>
  );
}

export default TicketRefund;
