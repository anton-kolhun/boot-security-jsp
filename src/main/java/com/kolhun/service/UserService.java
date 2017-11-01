package com.kolhun.service;

import com.kolhun.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
