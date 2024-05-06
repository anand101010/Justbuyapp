package com.justbuy.ServiceImpl;

import com.justbuy.Service.ProductStoreService;
import com.justbuy.model.ProductStore;
import com.justbuy.repository.ProductStoreRepository;
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
