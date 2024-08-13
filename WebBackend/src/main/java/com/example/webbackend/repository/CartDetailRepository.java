package com.example.webbackend.repository;

import com.example.webbackend.entity.CartDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface CartDetailRepository extends JpaRepository<CartDetailEntity, Integer> {
}
