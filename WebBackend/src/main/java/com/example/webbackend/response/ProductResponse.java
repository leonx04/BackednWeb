package com.example.webbackend.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author dungn
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductResponse {
    @Id
    private Integer id;
    private String code;
    private String name;
    private String imageUrl;

    private BigDecimal price;
    private String description;
    private String categoryName;
    private String brandName;
    private Date createAt;
    private Date updateAt;

//    public ProductResponse(Integer id, String code, String name, String imageUrl, BigDecimal price, String description, String categoryName, String brandName, Date createAt, Date updateAt) {
//        this.id = id;
//        this.code = code;
//        this.name = name;
//        this.imageUrl = imageUrl;
//        this.price = price;
//        this.description = description;
//        this.categoryName = categoryName;
//        this.brandName = brandName;
//        this.createAt = createAt;
//        this.updateAt = updateAt;
//    }
}
