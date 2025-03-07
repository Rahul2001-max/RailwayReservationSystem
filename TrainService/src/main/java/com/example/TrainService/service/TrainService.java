package com.example.TrainService.service;

import com.example.TrainService.entity.Train;

import java.util.List;

public interface TrainService {
    Train addTrain(Train train);
    Train getTrainById(Long id);
    List<Train> getAllTrains();
    List<Train> searchTrains(String source, String destination);
}
