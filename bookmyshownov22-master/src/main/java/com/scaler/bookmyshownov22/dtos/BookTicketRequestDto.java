package com.scaler.bookmyshownov22.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookTicketRequestDto {
    private List<Long> showSeatIds;
    private Long userId;
    private Long showId;
}

// {
//   showSeatIds: [],
// }
