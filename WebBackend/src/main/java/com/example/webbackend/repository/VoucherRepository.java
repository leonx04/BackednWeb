package com.example.webbackend.repository;

import com.example.webbackend.entity.VoucherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface VoucherRepository extends JpaRepository<VoucherEntity, Integer> {
}
