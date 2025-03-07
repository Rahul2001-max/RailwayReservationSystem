package com.example.ReservationService.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "train-service")
public interface TrainServiceClient {

    @PutMapping("/trains/updateSeats/{trainId}")
    void updateAvailableSeats(@PathVariable Long trainId, @RequestParam int seatsBooked);
}
