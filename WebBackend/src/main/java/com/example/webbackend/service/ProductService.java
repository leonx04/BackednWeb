package com.example.webbackend.service;

import com.example.webbackend.dto.request.ProductCreateRequest;
import com.example.webbackend.entity.ProductEntity;
import com.example.webbackend.repository.ProductRepository;
import com.example.webbackend.response.ProductResponse;
import com.example.webbackend.responseRepository.ProductResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * @author dungn
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductResponseRepository productResponseRepository;

    public List<ProductResponse> getAll() {
        return productResponseRepository.findAll();
    }

    public ProductEntity createProductRquest(ProductCreateRequest request) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setCode(request.getCode());
        productEntity.setName(request.getName());
        productEntity.setImageUrl(request.getImageUrl());
        productEntity.setPrice(request.getPrice());
        productEntity.setDescription(request.getDescription());
        productEntity.setCreateAt((Date) request.getCreateAt());
        productEntity.setUpdateAt((Date) request.getUpdateAt());
        return productRepository.save(productEntity);
    }

    public ProductResponse detailPromotion(Integer id) {
        return productResponseRepository.findById(id).get();
    }


    public ProductEntity updateProductById(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    public ProductEntity deleteProduct(Integer id) {
        ProductEntity productEntity = productRepository.findById(id).get();
        productRepository.delete(productEntity);
        return productEntity;
    }
}
