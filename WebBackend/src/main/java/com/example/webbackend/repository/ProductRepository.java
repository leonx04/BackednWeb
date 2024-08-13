package com.example.webbackend.repository;

import com.example.webbackend.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
