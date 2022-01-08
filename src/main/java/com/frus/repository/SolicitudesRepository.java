package com.frus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frus.model.Solicitud;

public interface SolicitudesRepository extends JpaRepository<Solicitud, Integer> {

}
