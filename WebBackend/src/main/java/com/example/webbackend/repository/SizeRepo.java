package com.example.webbackend.repository;

import com.example.webbackend.entity.SizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface SizeRepo extends JpaRepository<SizeEntity, Integer> {
}
