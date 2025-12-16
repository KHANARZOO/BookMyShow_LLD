package com.bookmyshow_lld.Dtos;

import com.bookmyshow_lld.models.Booking;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMovieResponseDto {
    private Booking booking;
    private ResponseStatus status;
}
