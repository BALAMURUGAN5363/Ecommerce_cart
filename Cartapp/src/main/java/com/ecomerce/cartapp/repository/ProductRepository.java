package com.ecomerce.cartapp.repository;

import com.ecomerce.cartapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
