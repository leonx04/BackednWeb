package com.example.webbackend.repository;

import com.example.webbackend.entity.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface MaterialRepository  extends JpaRepository<MaterialEntity, Integer> {
}
