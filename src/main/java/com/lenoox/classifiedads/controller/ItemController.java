package com.lenoox.classifiedads.controller;

import com.lenoox.classifiedads.model.Item;
import com.lenoox.classifiedads.repository.ItemRepository;
import com.lenoox.classifiedads.exception.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/items")
public class ItemController {

    @Autowired
    private ItemRepository repository;

    @GetMapping()
    List<Item> findAll(){
        return repository.findAll();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    Item newItem(@RequestBody Item newItem){
        newItem.setDateCreated();
        return repository.save(newItem);
    }

    @GetMapping("/{id}")
    Item findOne(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException(id));
    }

    @PutMapping("/{id}")
    Item saveOrUpdate(@RequestBody Item newItem, @PathVariable Long id){
        return repository.findById(id)
                .map(x -> {
                    x.setName(newItem.getName());
                    x.setPrice(newItem.getPrice());
                    x.setState(newItem.getState());
                    x.setColor(newItem.getColor());
                    x.setDescription(newItem.getDescription());
                    x.setDateCreated();
                    return repository.save(x);
                })
                .orElseGet(()->{
                    newItem.setId(id);
                    return repository.save(newItem);
                });
    }
    @DeleteMapping("/{id}")
    void deleteItem(@PathVariable Long id){ repository.deleteById(id); }
}
