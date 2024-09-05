package com.scaler.bookmyshownov22.repositories;

import com.scaler.bookmyshownov22.models.Seat;
import com.scaler.bookmyshownov22.models.ShowSeat;
import com.scaler.bookmyshownov22.models.ShowSeatState;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.LockModeType;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {


    @Lock(LockModeType.PESSIMISTIC_WRITE)
    List<ShowSeat> findAllByIdIn(List<Long> showSeatIds);

    ShowSeat save(ShowSeat showSeat);
    // save() can be used to create as well as to update
    // if the ID in the parameter is null -> create
    // else: update is called

//    @Query("select show_id from show_seat where show_seat.id in (?)")
//    List<ShowSeat> findAllByIdInForUpdate(List<Long> showSeatIds);
// select * from show_seats where id in {} for update

}
