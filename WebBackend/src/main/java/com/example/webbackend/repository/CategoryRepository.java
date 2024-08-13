package com.example.webbackend.repository;

import com.example.webbackend.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}
