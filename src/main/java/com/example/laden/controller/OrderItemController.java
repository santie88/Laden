package com.example.laden.controller;

import com.example.laden.logic.OrderItemLogic;
import com.example.laden.model.OrderItem;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order/item")
@AllArgsConstructor
public class OrderItemController {

    private final OrderItemLogic orderItemLogic;

    @GetMapping("/all")
    public List<OrderItem> findAll(){
        return orderItemLogic.findAll();
    }

    @GetMapping("/all/{order_id}")
    public List<OrderItem> findAllByOrder(@PathVariable("order_id") int id){
        return orderItemLogic.findAllByOrder(id);
    }

    @PostMapping()
    public OrderItem create(@RequestBody OrderItem orderItem){
        return orderItemLogic.create(orderItem);
    }
}
