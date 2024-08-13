package com.example.webbackend.repository;

import com.example.webbackend.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface PaymentRepository  extends JpaRepository<PaymentEntity, Integer> {
}
