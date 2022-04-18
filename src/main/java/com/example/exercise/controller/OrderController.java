package com.example.exercise.controller;

import com.example.exercise.domain.Order;
import com.example.exercise.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/ordine")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping(path="/{id}")
    ResponseEntity<Order> findById(@PathVariable String id) {
        Optional<Order> order = orderService.findById(id);
        return new ResponseEntity<Order>((Order) orderService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping()
    ResponseEntity<?> findAll() {
        return new ResponseEntity<>(orderService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Order> saveOne(@RequestBody Order order) {
        Order order1 = orderService.saveOne(order);
        return new ResponseEntity<>(order1, HttpStatus.OK);
    }

    @DeleteMapping(path="/{id}")
    ResponseEntity<Void> deleteOne(@PathVariable String id) {
        orderService.deleteOne(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}