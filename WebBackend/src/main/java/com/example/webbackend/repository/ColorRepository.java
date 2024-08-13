package com.example.webbackend.repository;

import com.example.webbackend.entity.ColorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface ColorRepository extends JpaRepository<ColorEntity, Integer> {
}
