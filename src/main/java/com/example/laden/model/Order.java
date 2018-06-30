package com.example.laden.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "order", catalog = "laden")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_generator")
    @SequenceGenerator(name="order_generator", sequenceName = "order_seq")
    private int id;
    @ManyToOne(optional = false)
    private Customer customer;
}
