package com.example.laden.controller;

import com.example.laden.logic.ItemLogic;
import com.example.laden.model.Item;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item")
@AllArgsConstructor
public class ItemController {

    private final ItemLogic itemLogic;

    @GetMapping("/all")
    public List<Item> findAll(){
        return itemLogic.findAll();
    }

    @PostMapping
    public Item create(@RequestBody Item item){
        return itemLogic.create(item);
    }
}
