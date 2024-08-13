package com.example.webbackend.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author dungn
 */
@Getter
@Setter
public class ProductCreateRequest {
    private String code;
    private String name;
    private String imageUrl;

    private BigDecimal price;
    private String description;
    private String categoryName;
    private String brandName;
    private Date createAt;
    private Date updateAt;
}
