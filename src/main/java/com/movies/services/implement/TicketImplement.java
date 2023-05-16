package com.movies.services.implement;

import org.springframework.stereotype.Service;

import com.movies.model.TicketModel;
import com.movies.repository.TicketRepository;
import com.movies.services.TicketService;
@Service
public class TicketImplement implements TicketService{
    TicketRepository ticketRepository;
    public  TicketImplement(TicketRepository ticketRepository) {
        this.ticketRepository=ticketRepository;
   }
    @Override
    public String buyTicket(TicketModel ticket) {
        ticketRepository.save(ticket);  
        return "Success";      
    }
}
