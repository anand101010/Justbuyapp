package com.justbuy.Service;

import com.justbuy.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> GetAllProduct();


}
