package com.bookmyshow_lld.services;

import com.bookmyshow_lld.models.Show;
import com.bookmyshow_lld.models.ShowSeat;
import com.bookmyshow_lld.models.ShowSeatType;
import com.bookmyshow_lld.repositories.ShowSeatTypeRepository;

import java.util.List;

public class PriceCalculatorService {
    private ShowSeatTypeRepository showSeatTypeRepository;
    public PriceCalculatorService(ShowSeatTypeRepository showSeatTypeRepository) {
        this.showSeatTypeRepository = showSeatTypeRepository;
    }
    public int calculatePrice(List<ShowSeat> showSeats, Show show) {
        List<ShowSeatType> showSeatType = showSeatTypeRepository.findAllByShow(show);

        int amount = 0;
        for(ShowSeat showSeat : showSeats) {
            for(ShowSeatType seatType : showSeatType) {
                if(showSeat.getSeat().getSeatType().equals(seatType.getSeatType())) {
                    amount += seatType.getPrice();
                    break;
                }
            }
        }
        return amount;
    }
}
