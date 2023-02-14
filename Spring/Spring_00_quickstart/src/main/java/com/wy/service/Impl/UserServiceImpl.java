package com.wy.service.Impl;

import com.wy.dao.UserDao;
import com.wy.service.UserService;
import lombok.Setter;

@Setter
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public void ServiceSave() {
        userDao.save();
        System.out.println("service...");
    }
}
