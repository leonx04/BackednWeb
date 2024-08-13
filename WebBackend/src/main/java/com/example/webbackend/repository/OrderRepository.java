package com.example.webbackend.repository;

import com.example.webbackend.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
}
