package com.example.exercise.service;

import com.example.exercise.domain.Product;
import com.example.exercise.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServer {

    @Autowired
    ProductRepository productRepository;

    public Optional<Product> findById(String id) {
        return productRepository.findById(id);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product saveOne(Product prodotto) {
        return productRepository.save(prodotto);
    }

    public void deleteOne(String id) {
        productRepository.deleteById(id);
    }
}
