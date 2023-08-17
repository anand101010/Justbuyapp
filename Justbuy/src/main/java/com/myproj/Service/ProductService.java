package com.bezkoder.spring.datajpa.Service;

import com.bezkoder.spring.datajpa.model.Orders;
import com.bezkoder.spring.datajpa.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> GetAllProduct();

}
