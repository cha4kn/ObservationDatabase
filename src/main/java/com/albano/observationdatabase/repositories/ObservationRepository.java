package com.albano.observationdatabase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.albano.observationdatabase.models.Observation;

public interface ObservationRepository extends JpaRepository<Observation, Long>{

}
