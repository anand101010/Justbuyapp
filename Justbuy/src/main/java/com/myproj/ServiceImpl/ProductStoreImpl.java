package com.bezkoder.spring.datajpa.ServiceImpl;

import com.bezkoder.spring.datajpa.Service.ProductStoreService;
import com.bezkoder.spring.datajpa.model.ProductStore;
import com.bezkoder.spring.datajpa.repository.ProductRepository;
import com.bezkoder.spring.datajpa.repository.ProductStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductStoreImpl implements ProductStoreService {
    @Autowired
    ProductStoreRepository productstoreRepository;
  ;
    @Override
    public ProductStore saveProductstore(ProductStore productStore) {
        return productstoreRepository.save(productStore);
    }
}
