package com.example.webbackend.repository;


import com.example.webbackend.entity.ProductDetailPromotionEntity;
import com.example.webbackend.entity.ProductDetailPromotionEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface ProductDetailPromotionRepo extends JpaRepository<ProductDetailPromotionEntity, ProductDetailPromotionEntityPK> {
}