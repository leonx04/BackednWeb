package com.example.webbackend.responseRepository;

import com.example.webbackend.response.ProductResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductResponseRepository extends JpaRepository<ProductResponse, Integer> {
    @Query("SELECT new com.example.webbackend.response.ProductResponse(p.id, p.code, p.name, p.imageUrl, p.price, p.description, c.name, b.name, p.createAt, p.updateAt) " +
            "FROM ProductEntity p " +
            "JOIN p.categoryByCategoryId c " +
            "JOIN p.brandByBrandId b")
    List<ProductResponse> findAll();
}