package com.bezkoder.spring.datajpa.Service;

import com.bezkoder.spring.datajpa.model.Orders;
import com.bezkoder.spring.datajpa.model.Product;
import com.bezkoder.spring.datajpa.model.Store;
import com.bezkoder.spring.datajpa.model.User;

import java.util.List;

public interface StoreService {
    Store saveStore(Store store);
    List<Store> GetAllStore();






}
