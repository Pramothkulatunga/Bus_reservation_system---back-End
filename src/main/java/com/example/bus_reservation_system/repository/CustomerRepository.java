package com.example.bus_reservation_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bus_reservation_system.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}