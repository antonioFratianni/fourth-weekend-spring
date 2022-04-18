package com.example.exercise.service;

import com.example.exercise.domain.Order;
import com.example.exercise.domain.Product;
import com.example.exercise.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Optional<Order> findById(String id) {
        return orderRepository.findById(id);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order saveOne(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOne(String id) {
        orderRepository.deleteById(id);
    }
}
