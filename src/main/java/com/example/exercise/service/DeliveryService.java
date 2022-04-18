package com.example.exercise.service;

import com.example.exercise.domain.Delivery;
import com.example.exercise.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeliveryService {

    @Autowired
    DeliveryRepository deliveryRepository;

    public Optional<Delivery> findById(String id) {
        return deliveryRepository.findById(id);
    }

    public List<Delivery> findAll() {
        return deliveryRepository.findAll();
    }

    public Delivery saveOne(Delivery consegna) {
        return deliveryRepository.save(consegna);
    }

    public void deleteOne(String id) {
        deliveryRepository.deleteById(id);
    }

}
