package com.practo.user.service;

import com.practo.user.entities.User;
import com.practo.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> listAllUsers() {
        return userRepository.listAll();
    }

    public int computeFibonacci(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        return computeFibonacci(n-1) + computeFibonacci(n-2);
    }

}
