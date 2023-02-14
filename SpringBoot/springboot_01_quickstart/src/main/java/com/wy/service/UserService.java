package com.wy.service;

import com.wy.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(Integer id);
}
