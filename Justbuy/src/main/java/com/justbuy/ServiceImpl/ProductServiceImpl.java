package com.justbuy.ServiceImpl;

import com.justbuy.Service.ProductService;
import com.justbuy.model.Product;
import com.justbuy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
@Autowired
private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> GetAllProduct() {
        return productRepository.findAll();
    }
}
