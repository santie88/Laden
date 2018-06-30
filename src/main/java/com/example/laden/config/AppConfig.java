package com.example.laden.config;

import com.example.laden.logic.CustomerLogic;
import com.example.laden.logic.ItemLogic;
import com.example.laden.logic.OrderItemLogic;
import com.example.laden.logic.OrderLogic;
import com.example.laden.model.OrderItem;
import com.example.laden.repository.CustomerRepository;
import com.example.laden.repository.ItemRepository;
import com.example.laden.repository.OrderItemRepository;
import com.example.laden.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Bean
    public CustomerLogic customerLogic(){
        return new CustomerLogic(customerRepository);
    }

    @Bean
    public ItemLogic itemLogic(){
        return new ItemLogic(itemRepository);
    }

    @Bean
    public OrderItemLogic orderItemLogic(){
        return new OrderItemLogic(orderItemRepository);
    }

    @Bean
    public OrderLogic orderLogic(){
        return new OrderLogic(orderRepository);
    }
}
