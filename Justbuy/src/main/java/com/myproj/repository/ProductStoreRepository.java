package com.bezkoder.spring.datajpa.repository;

import com.bezkoder.spring.datajpa.model.ProductStore;
import com.bezkoder.spring.datajpa.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStoreRepository extends JpaRepository<ProductStore,Integer>  {




}
