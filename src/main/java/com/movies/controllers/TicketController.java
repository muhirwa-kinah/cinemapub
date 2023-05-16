package com.movies.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.model.TicketModel;
import com.movies.services.TicketService;
@RestController
@RequestMapping("/api/")
public class TicketController {
    TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService=ticketService;
    }
    @PostMapping("buyTicket")
    public String buyTicket(@RequestBody TicketModel ticket ) {
        ticketService.buyTicket(ticket);
        return "Success";  
    }
    
}
