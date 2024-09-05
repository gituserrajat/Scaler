package com.scaler.bookmyshownov22.exceptions;

public class ShowSeatNotAvailableException extends Exception {

    public ShowSeatNotAvailableException(Long seatId) {
        super("Seat: " + seatId + " is not available for booking.");
    }
}
