package com.example.webbackend.repository;


import com.example.webbackend.entity.PromotionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface PromotionRepo extends JpaRepository<PromotionEntity, Integer> {
}
