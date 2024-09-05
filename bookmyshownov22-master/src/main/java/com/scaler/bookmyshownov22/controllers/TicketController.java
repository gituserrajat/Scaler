package com.scaler.bookmyshownov22.controllers;

import com.scaler.bookmyshownov22.dtos.BookTicketRequestDto;
import com.scaler.bookmyshownov22.dtos.BookTicketResponseDto;
import com.scaler.bookmyshownov22.models.Ticket;
import com.scaler.bookmyshownov22.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.scaler.bookmyshownov22.exceptions.ShowSeatNotAvailableException;

@Controller
public class TicketController {
    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public BookTicketResponseDto bookTicket(BookTicketRequestDto request) throws ShowSeatNotAvailableException {
        
        Ticket ticket = ticketService.bookTicket(
                request.getShowSeatIds(),
                request.getUserId(),
                request.getShowId()
        );



        return null;
    }
}
