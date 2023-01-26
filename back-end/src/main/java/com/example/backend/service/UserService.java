package com.example.backend.service;

import com.example.backend.pojo.User;

/**
 * @author HDH
 * @version 1.0
 */

public interface UserService {
    User checkUser(String username,String password);
}
