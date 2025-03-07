package com.example.ReservationService.service;

import com.example.ReservationService.entity.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation bookTicket(Long userId, Long trainId, int seats);
    Reservation getReservationById(Long id);
    List<Reservation> getUserReservations(Long userId);
    String cancelReservation(Long id);
}
