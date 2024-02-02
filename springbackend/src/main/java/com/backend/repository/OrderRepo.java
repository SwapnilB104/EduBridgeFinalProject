package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.entity.OrderData;

@Repository
public interface OrderRepo extends JpaRepository<OrderData, Long> {
}
