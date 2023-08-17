package com.bezkoder.spring.datajpa.Service;

import com.bezkoder.spring.datajpa.model.Orders;
import com.bezkoder.spring.datajpa.model.Product;
import com.bezkoder.spring.datajpa.model.Store;
import com.bezkoder.spring.datajpa.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> GetAllUser();
    User getuserByID(long user_id);


}
