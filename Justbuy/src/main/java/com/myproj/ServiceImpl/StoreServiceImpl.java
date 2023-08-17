package com.bezkoder.spring.datajpa.ServiceImpl;

import com.bezkoder.spring.datajpa.Service.StoreService;
import com.bezkoder.spring.datajpa.model.Product;
import com.bezkoder.spring.datajpa.model.Store;
import com.bezkoder.spring.datajpa.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreRepository storeRepository;

    @Override
    public Store saveStore(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public List<Store> GetAllStore() {
        return storeRepository.findAll();
    }


}
