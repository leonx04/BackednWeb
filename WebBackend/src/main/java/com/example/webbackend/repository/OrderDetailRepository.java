package com.example.webbackend.repository;

import com.example.webbackend.entity.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Integer> {
}
