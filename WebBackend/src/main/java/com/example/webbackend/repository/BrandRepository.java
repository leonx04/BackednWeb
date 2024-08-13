package com.example.webbackend.repository;

import com.example.webbackend.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Integer> {
}
