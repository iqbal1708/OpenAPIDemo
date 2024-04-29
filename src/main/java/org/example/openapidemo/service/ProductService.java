package org.example.openapidemo.service;


import org.example.openapidemo.controller.ProductsApiDelegate;
import org.example.openapidemo.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductsApiDelegate {
    @Override
    public ResponseEntity<Product> createProduct(Product product) {
        return ProductsApiDelegate.super.createProduct(product);
    }

    @Override
    public ResponseEntity<Product> getProductById(Integer id) {
        return ProductsApiDelegate.super.getProductById(id);
    }

    @Override
    public ResponseEntity<Void> deleteProduct(Integer id) {
        return ProductsApiDelegate.super.deleteProduct(id);
    }

    @Override
    public ResponseEntity<List<Product>> listProducts(Integer page, Integer size) {
        Product product = new Product();
        product.setId(1);
        product.setName("Product 1");
        product.setPrice(100.0);
        List<Product> products = List.of(product);
        return ResponseEntity.ok(products);
    }

    @Override
    public ResponseEntity<Product> updateProduct(Integer id, Product product) {
        return ProductsApiDelegate.super.updateProduct(id, product);
    }
}
