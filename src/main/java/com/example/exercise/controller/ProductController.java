package com.example.exercise.controller;

import com.example.exercise.domain.Product;
import com.example.exercise.service.ProductServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/prodotto")
public class ProductController {
    @Autowired
    ProductServer productServer;

    @GetMapping(path="/{id}")
    ResponseEntity<Product> findById(@PathVariable String id) {
        Optional<Product> product = productServer.findById(id);
        return new ResponseEntity<Product>((Product) productServer.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping()
    ResponseEntity<?> findAll() {
        return new ResponseEntity<>(productServer.findAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Product> saveOne(@RequestBody Product prodotto) {
        Product product1 = productServer.saveOne(prodotto);
        return new ResponseEntity<>(product1, HttpStatus.OK);
    }

    @DeleteMapping(path="/{id}")
    ResponseEntity<Void> deleteOne(@PathVariable String id) {
        productServer.deleteOne(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}


