package com.example.ReservationService.controller;

import com.example.ReservationService.entity.Reservation;
import com.example.ReservationService.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping("/book")
    public Reservation bookTicket(@RequestParam Long userId, @RequestParam Long trainId, @RequestParam int seats) {
        return reservationService.bookTicket(userId, trainId, seats);
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        return reservationService.getReservationById(id);
    }

    @GetMapping("/user/{userId}")
    public List<Reservation> getUserReservations(@PathVariable Long userId) {
        return reservationService.getUserReservations(userId);
    }

    @PutMapping("/cancel/{id}")
    public String cancelReservation(@PathVariable Long id) {
        return reservationService.cancelReservation(id);
    }
   
}
