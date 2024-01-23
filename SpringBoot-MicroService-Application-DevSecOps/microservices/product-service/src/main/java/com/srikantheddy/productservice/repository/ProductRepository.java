package com.srikantheddy.productservice.repository;
import  com.srikantheddy.productservice.model.Product;
import  org.springframework.data.mongodb.repository.MongoRepository;
public interface ProductRepository extends MongoRepository<Product, String> {
}

// Compare this snippet from src/main/java/com/srikantheddy/productservice/controller/ProductController.java:
