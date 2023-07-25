package com.backend.server.controller;

import com.backend.server.Model.tickets;
import com.backend.server.service.ticketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
@CrossOrigin(origins = "http://localhost:3000")
public class TicketsApis {

    @Autowired
    ticketService ticketService;

    @GetMapping(value = "/getAlltickets",produces = MediaType.APPLICATION_JSON_VALUE) // get all tickets for repoet generatiion
    public List<tickets> getAlltickets(){

        return ticketService.getAlltickets();
    }

    @GetMapping(value="/getByStatus") //TRENDING
    public List<tickets> getByStatus(@RequestParam String status){
        return ticketService.findByStatus(status);
    }
    @PostMapping("/addAlltickets")
    public void saveAlltickets(@RequestBody List<tickets> tickets){
        ticketService.addAlltickets(tickets);
    }
    @PostMapping("/addticket")
    public tickets addticket(@RequestBody tickets ticket){
        return ticketService.addticket(ticket);
    }
    @PostMapping("/cancelTicket")
    public tickets addticket(@RequestBody tickets ticket){
        return ticketService.cancelTicket(ticket);
    }
}
