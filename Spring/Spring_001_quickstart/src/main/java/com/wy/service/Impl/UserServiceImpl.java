package com.wy.service.Impl;

import com.wy.dao.UserDao;
import com.wy.service.UserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Setter
@Service("bookService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;
    @Override
    public void ServiceSave() {
        userDao.save();
        System.out.println("service...");
    }
}
