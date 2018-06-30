package com.example.laden.logic;

import com.example.laden.model.OrderItem;
import com.example.laden.repository.OrderItemRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class OrderItemLogic {

    private final OrderItemRepository orderItemRepository;

    public List<OrderItem> findAll() {
        return orderItemRepository.findAll();
    }

    public OrderItem create(OrderItem orderItem) {
        try {
            return orderItemRepository.save(orderItem);
        }
        catch (Exception ex){
            throw new RuntimeException();
        }
    }

    public List<OrderItem> findAllByOrder(int orderId) {
        return orderItemRepository.findByOrderId(orderId);
    }
}
