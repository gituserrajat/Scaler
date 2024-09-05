package com.scaler.bookmyshownov22.dtos;

import com.scaler.bookmyshownov22.models.Ticket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponseDto {
    private ResponseStatus responseStatus;
    private Ticket ticket;
}

