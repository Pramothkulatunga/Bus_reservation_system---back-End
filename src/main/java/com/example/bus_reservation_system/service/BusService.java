package com.example.bus_reservation_system.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bus_reservation_system.model.Bus;

@Service
public class BusService {

    private final List<Bus> buses = new ArrayList<>();

    public List<Bus> getAllBuses() {
        return buses;
    }

    public Bus getBusById(Long id) {
        return buses.stream().filter(b -> b.getId().equals(id)).findFirst().orElse(null);
    }

    public Bus saveBus(Bus bus) {
        buses.add(bus);
        return bus;
    }

    public void deleteBus(Long id) {
        buses.removeIf(b -> b.getId().equals(id));
    }
}