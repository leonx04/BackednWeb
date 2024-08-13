package com.example.webbackend.repository;

import com.example.webbackend.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface CartRepository extends JpaRepository<CartEntity, Integer> {
}
