package com.example.webbackend.repository;

import com.example.webbackend.entity.VoucherUsageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface VoucherUsageRepository extends JpaRepository<VoucherUsageEntity, Integer> {
}
