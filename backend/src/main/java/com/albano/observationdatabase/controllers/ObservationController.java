package com.albano.observationdatabase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.albano.observationdatabase.models.Observation;
import com.albano.observationdatabase.repositories.ObservationRepository;

@RestController
@RequestMapping("/api/observations")
public class ObservationController {

    @Autowired
    private ObservationRepository observationRepository;

    @PostMapping
    public ResponseEntity<Observation> addObservation(@ModelAttribute Observation observation) {
        Observation savedObservation = observationRepository.save(observation);
        return new ResponseEntity<>(savedObservation, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Observation>> getObservations() {
        List<Observation> observations = observationRepository.findAll();
        return new ResponseEntity<>(observations, HttpStatus.OK);
    }
}
