package com.example.laden.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "order_item", catalog = "laden")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_item_generator")
    @SequenceGenerator(name="order_item_generator", sequenceName = "order_item_seq")
    private int id;
    @Column(nullable = false)
    private int quantity;
    @ManyToOne(optional = false)
    private Item item;
    @ManyToOne(optional = false)
    private Order order;
}
