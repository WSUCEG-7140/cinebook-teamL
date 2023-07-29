/**
 * @file
 * @brief This file contains the definition of the TicketsApis class.
 */

package com.backend.server.controller;

import com.backend.server.Model.tickets;
import com.backend.server.service.ticketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @class TicketsApis
 * @brief This class represents the REST API endpoints for ticket management.
 *        It handles requests related to tickets and interacts with the ticketService.
 */
@RestController
@RequestMapping("/tickets")
@CrossOrigin(origins = "http://localhost:3000")
public class TicketsApis {

    /**
     * @brief The ticketService instance to interact with ticket-related operations.
     */
    @Autowired
    ticketService ticketService;

    /**
     * @brief Retrieves all tickets from the database.
     *
     * @return A list of tickets in JSON format for report generation.
     */
    @GetMapping(value = "/getAlltickets", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<tickets> getAlltickets() {
        return ticketService.getAlltickets();
    }

    /**
     * @brief Retrieves tickets by their status.
     *
     * @param status The status of the tickets to retrieve (e.g., "TRENDING").
     * @return A list of tickets in JSON format that match the specified status.
     */
    @GetMapping(value = "/getByStatus")
    public List<tickets> getByStatus(@RequestParam String status) {
        return ticketService.findByStatus(status);
    }

    /**
     * @brief Saves a list of tickets to the database.
     *
     * @param tickets The list of tickets to be saved.
     */
    @PostMapping("/addAlltickets")
    public void saveAlltickets(@RequestBody List<tickets> tickets) {
        ticketService.addAlltickets(tickets);
    }

    /**
     * @brief Adds a new ticket to the database.
     *
     * @param ticket The ticket object to be added.
     * @return The ticket object that was added.
     */
    @PostMapping("/addticket")
    public tickets addticket(@RequestBody tickets ticket) {
        return ticketService.addticket(ticket);
    }

    /**
     * @brief Cancels a ticket by updating its status.
     *
     * @param ticket The ticket object to be canceled.
     * @return The updated ticket object with the new status.
     */
    @PostMapping("/cancelTicket")
    public tickets addticket(@RequestBody tickets ticket) {
        return ticketService.cancelTicket(ticket);
    }
}
