package com.example.travelapp.service;

import com.example.travelapp.model.Trip;
import com.example.travelapp.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public List<Trip> findByUser(Long userId) {
        return tripRepository.findByUserId(userId);
    }

    public Trip save(Trip trip) {
        return tripRepository.save(trip);
    }
}
