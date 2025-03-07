package com.example.ReservationService.service.impl;

import com.example.ReservationService.Exception.ReservationNotFoundException;
import com.example.ReservationService.entity.Reservation;
import com.example.ReservationService.feign.TrainServiceClient;
import com.example.ReservationService.repository.ReservationRepository;
import com.example.ReservationService.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;
    
    @Override
    public Reservation bookTicket(Long userId, Long trainId, int seats) {
        Reservation reservation = Reservation.builder()
                .userId(userId)
                .trainId(trainId)
                .seatsBooked(seats)
                .bookingTime(LocalDateTime.now())
                .status("CONFIRMED")
                .build();
        return reservationRepository.save(reservation);
    }
    

    @Override
    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new ReservationNotFoundException("Reservation not found with ID: " + id));
    }

    @Override
    public List<Reservation> getUserReservations(Long userId) {
        return reservationRepository.findByUserId(userId);
    }

    @Override
    public String cancelReservation(Long id) {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));

        reservation.setStatus("CANCELLED");
        reservationRepository.save(reservation);
        return "Reservation cancelled successfully!";
    }
}
