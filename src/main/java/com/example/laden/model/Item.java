package com.example.laden.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "item", catalog = "laden")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_generator")
    @SequenceGenerator(name="item_generator", sequenceName = "item_seq", allocationSize=50)
    private int id;
    @Column(nullable = false)
    private String sku;
    @Column(nullable = false)
    private String name;
    private float price;
}
