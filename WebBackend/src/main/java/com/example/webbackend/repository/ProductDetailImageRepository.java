package com.example.webbackend.repository;

import com.example.webbackend.entity.ProductDetailImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface ProductDetailImageRepository extends JpaRepository<ProductDetailImageEntity, Integer> {
}
