package com.backend.server.service;

import com.backend.server.Model.ticket;

import java.util.Optional;


public interface TicketService {
    public ticket addticket(ticket ticket);
    public Optional<ticket> getticket(String email);

    ticket updateticket(ticket ticket);

    String deleteticket(String mobileNumber);

     String cancelTicket(String mobileNumber);

//    Inventory addItemToCart(Inventory inventory);
}
