package com.example.bus_reservation_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bus_reservation_system.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}