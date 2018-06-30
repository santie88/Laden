package com.example.laden.controller;

import com.example.laden.logic.OrderLogic;
import com.example.laden.model.Order;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@AllArgsConstructor
public class OrderController {

    private final OrderLogic orderLogic;

    @GetMapping("/all")
    public List<Order> findAll(){
        return orderLogic.findAll();
    }

    @PostMapping
    public Order create(@RequestBody Order order){
        return orderLogic.create(order);
    }

}
