package com.example.backend.dao;

import com.example.backend.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author HDH
 * @version 1.0
 */
public interface UserRepository extends JpaRepository <User,Long>{
    User findByUsernameAndPassword(String username,String password);
}
