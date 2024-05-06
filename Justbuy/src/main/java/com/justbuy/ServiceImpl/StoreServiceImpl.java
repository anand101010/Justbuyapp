package com.justbuy.ServiceImpl;

import com.justbuy.Service.StoreService;
import com.justbuy.model.Store;
import com.justbuy.repository.StoreRepository;
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
