package com.example.laden.logic;

import com.example.laden.model.Item;
import com.example.laden.repository.ItemRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ItemLogic {

    private final ItemRepository itemRepository;

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item create(Item item) {
        try {
            return itemRepository.save(item);
        }
        catch (Exception ex){
            throw new RuntimeException();
        }
    }
}
