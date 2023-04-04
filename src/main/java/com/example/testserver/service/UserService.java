package com.example.testserver.service;

import com.example.testserver.TestServerApplication;
import com.example.testserver.model.User;
import com.example.testserver.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        log.info("Get all users");
        return userRepository.findAll();
    }

    public User createNewUser() {
        log.info("Create new user");
        User user = new User();
        UUID uuid = UUID.randomUUID();
        user.setName("Test");
        user.setLastName("Test №" + uuid);
        user.setNickName("NickName " + uuid);
        user.setStatus(false);
        user.setLocation("Test");
        user.setPhoneNumber(String.valueOf(uuid));
        userRepository.save(user);
        return user;
    }

    public User deleteUser(String id) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            userRepository.delete(user);
        }
        return user;
    }
}
