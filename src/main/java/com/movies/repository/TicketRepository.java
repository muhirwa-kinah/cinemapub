package com.movies.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.model.TicketModel;

public interface TicketRepository extends JpaRepository<TicketModel, String> {
 
  
}
