package com.example.bus_reservation_system.service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bus_reservation_system.model.Customer;
import com.example.bus_reservation_system.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomerStack() {
        List<Customer> customers = customerRepository.findAll();
        Collections.reverse(customers);
        return customers;
    }

    public Customer saveCustomer(Customer customer) {
        if (customer.getRegistrationDate() == null || customer.getRegistrationDate().isEmpty()) {
            customer.setRegistrationDate(LocalDate.now().toString());
        }
        return customerRepository.save(customer);
    }

    public boolean deleteCustomer(Long id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
            return true;
        }
        return false;
    }
}