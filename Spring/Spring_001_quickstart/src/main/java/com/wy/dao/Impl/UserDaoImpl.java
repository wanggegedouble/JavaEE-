package com.wy.dao.Impl;

import com.wy.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userDao~~~~");
    }
}
