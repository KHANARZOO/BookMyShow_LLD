package com.bookmyshow_lld.repositories;

import com.bookmyshow_lld.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {

    List<ShowSeat> findAllById(List<Long> showSeatsIds);

    @Override
    ShowSeat save(ShowSeat showSeat);
}
