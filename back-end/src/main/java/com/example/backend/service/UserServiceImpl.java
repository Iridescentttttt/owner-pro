package com.example.backend.service;

import com.example.backend.dao.UserRepository;
import com.example.backend.pojo.User;
import com.example.backend.util.MDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HDH
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MDUtils.code(password));
        return user;
    }
}
