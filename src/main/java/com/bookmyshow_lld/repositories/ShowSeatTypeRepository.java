package com.bookmyshow_lld.repositories;

import com.bookmyshow_lld.models.Show;
import com.bookmyshow_lld.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Integer> {
    List<ShowSeatType>  findAllByShow(Show show);
}
