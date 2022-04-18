package com.example.exercise.repository;

import com.example.exercise.domain.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, String> {
}
