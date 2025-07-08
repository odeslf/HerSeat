package com.herseat.herseat.repository;

import com.herseat.herseat.model.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TravelRepository extends JpaRepository<Travel, Long> {

    //Find travel by origin and destination
    List<Travel> findByOriginAndDestination(String origin, String destination);
}
