package com.albano.observationdatabase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Observation addObservation(@RequestBody Observation observation) {
        return observationRepository.save(observation);
    }

    @GetMapping
    public List<Observation> getObservations() {
        return observationRepository.findAll();
    }
}
