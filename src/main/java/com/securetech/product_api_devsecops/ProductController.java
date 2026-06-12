package com.securetech.product_api_devsecops;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    // Création d'une liste pour stocker nos produits
    private final List<Product> products = new ArrayList<>();

    // Constructeur pour remplir la liste au démarrage
    public ProductController() {
        products.add(new Product(1, "Machine à café", "Électroménager"));
        products.add(new Product(2, "Lessive Skip (petit et puissant)", "Produits d'entretien"));
        products.add(new Product(3, "Micro-onde SEB", "Électroménager"));
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return products;
    }

    @GetMapping("/health")
    public String getHealth() {
        return "{\"status\":\"OK\"}";
    }

}