package com.example.webbackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author dungn
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ProductDetailPromotionEntityPK implements Serializable {
    @Column(name = "promotion_id", nullable = false)
    private Integer promotionId;

    @Column(name = "product_detail_id", nullable = false)
    private int productDetailId;
}