package com.example.laden.logic;

import com.example.laden.model.Customer;
import com.example.laden.repository.CustomerRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CustomerLogic {

    private final CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer create(Customer customer) {
        try {
            return customerRepository.save(customer);
        }
        catch (Exception ex){
            throw new RuntimeException();
        }
    }
}
