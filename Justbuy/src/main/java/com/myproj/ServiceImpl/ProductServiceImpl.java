package com.bezkoder.spring.datajpa.ServiceImpl;

import com.bezkoder.spring.datajpa.Service.ProductService;
import com.bezkoder.spring.datajpa.model.Product;
import com.bezkoder.spring.datajpa.repository.ProductRepository;
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
