package com.example.laden.controller;

import com.example.laden.logic.CustomerLogic;
import com.example.laden.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerLogic customerLogic;

    public CustomerController(CustomerLogic customerLogic) {
        this.customerLogic = customerLogic;
    }

    @GetMapping("/all")
    public List<Customer> findAll(){
        return customerLogic.findAll();
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer){
        return customerLogic.create(customer);
    }
}
