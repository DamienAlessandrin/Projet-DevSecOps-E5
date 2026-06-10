package com.securetech.product_api_devsecops;

import lombok.Data;

@Data
public class Product {
    private long id;
    private String name;
    private String category;

    public Product(long id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }
}