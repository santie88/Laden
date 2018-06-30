package com.example.laden.logic;

import com.example.laden.model.Order;
import com.example.laden.repository.OrderRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class OrderLogic {

    private final OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order create(Order order) {
        try {
            return orderRepository.save(order);
        }
        catch (Exception ex){
            throw new RuntimeException();
        }
    }
}
