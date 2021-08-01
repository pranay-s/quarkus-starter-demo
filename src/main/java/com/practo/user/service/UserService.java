package com.practo.user.service;

import com.practo.user.entities.User;
import com.practo.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> listAllUsers() {
        return userRepository.listAll();
    }
    @Transactional
    public boolean createUser(User user) {
        userRepository.persist(user);
        return true;
    }
}
