package com.example.webbackend.repository;

import com.example.webbackend.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dungn
 */
@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {
}
