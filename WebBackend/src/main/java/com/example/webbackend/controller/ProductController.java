package com.example.webbackend.controller;

import com.example.webbackend.dto.request.ProductCreateRequest;
import com.example.webbackend.entity.ProductEntity;
import com.example.webbackend.repository.ProductRepository;
import com.example.webbackend.response.ProductResponse;
import com.example.webbackend.responseRepository.ProductResponseRepository;
import com.example.webbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

/**
 * @author dungn
 */
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;


    @GetMapping("/all")
    public List<ProductResponse> getAll2() {
        return productService.getAll();
    }


    @PostMapping("/create")
    public ProductEntity create(@RequestBody ProductCreateRequest request) {
        return productService.createProductRquest(request);
    }

    @GetMapping("/detail/{id}")
    public ProductResponse detailPromotion(@PathVariable Integer id) {
        return productService.detailPromotion(id);
    }

    @PutMapping("/update/{id}")
    public ProductEntity update(@PathVariable Integer id, @RequestBody ProductEntity productEntity) {
        return productService.updateProductById(productEntity);
    }

    @DeleteMapping("/delete/{id}")
    public ProductEntity delete(@PathVariable Integer id) {
        return productService.deleteProduct(id);
    }




}
