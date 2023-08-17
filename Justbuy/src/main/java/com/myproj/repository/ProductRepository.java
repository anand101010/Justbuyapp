package com.bezkoder.spring.datajpa.repository;

import com.bezkoder.spring.datajpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
