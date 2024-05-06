package com.justbuy.Service;

import com.justbuy.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> GetAllUser();
    User getuserByID(long user_id);


}
