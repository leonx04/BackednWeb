package com.example.webbackend.repository;

import com.example.webbackend.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
