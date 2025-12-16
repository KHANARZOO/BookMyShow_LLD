package com.bookmyshow_lld.controllers;

import com.bookmyshow_lld.Dtos.BookMovieRequestDto;
import com.bookmyshow_lld.Dtos.BookMovieResponseDto;
import com.bookmyshow_lld.Dtos.ResponseStatus;
import com.bookmyshow_lld.exceptions.ShowNotFoundException;
import com.bookmyshow_lld.exceptions.UserNotFoundException;
import com.bookmyshow_lld.models.Booking;
import com.bookmyshow_lld.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    public BookMovieResponseDto bookMovie(BookMovieRequestDto bookMovieRequestDto) {
        BookMovieResponseDto bookMovieResponseDto = new BookMovieResponseDto();
        try{
            Booking booking = bookingService.bookMovie(bookMovieRequestDto.getUserId(),
                    bookMovieRequestDto.getShowId(),
                    bookMovieRequestDto.getShowSeatsIds());
            bookMovieResponseDto.setBooking(booking);
            bookMovieResponseDto.setStatus(ResponseStatus.SUCCESS);
        }catch(Exception e){
            bookMovieResponseDto.setStatus(ResponseStatus.FAILURE);

        }
        return bookMovieResponseDto;
    }
}
