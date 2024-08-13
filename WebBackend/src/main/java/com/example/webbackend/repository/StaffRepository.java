package com.example.webbackend.repository;

import com.example.webbackend.entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface StaffRepository  extends JpaRepository<StaffEntity, Integer> {
}
