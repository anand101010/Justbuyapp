package com.bezkoder.spring.datajpa.ServiceImpl;

import com.bezkoder.spring.datajpa.Service.UserService;
import com.bezkoder.spring.datajpa.model.User;
import com.bezkoder.spring.datajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserRepository userRepository;


    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> GetAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getuserByID(long user_id) {
        return userRepository.getById(user_id);
    }
}

