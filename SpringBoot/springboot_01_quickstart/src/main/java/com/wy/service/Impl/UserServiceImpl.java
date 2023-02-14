package com.wy.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wy.dao.UserDao;
import com.wy.domain.User;
import com.wy.domain.UserQuery;
import com.wy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAll() {
       /* QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.lt("money",10000);
        List<User> users = userDao.selectList(queryWrapper);*/
        /*LambdaQueryWrapper<User> lambdaQW = new LambdaQueryWrapper<User>();
        lambdaQW.lt(User::getMoney,20000);
        lambdaQW.gt(User::getMoney,5000);
        List<User> users = userDao.selectList(lambdaQW);*/
        UserQuery userQuery = new UserQuery();
        userQuery.setMoney(5000.0);
        userQuery.setMoney2(20000.0);
        LambdaQueryWrapper<User> lambdaQW = new LambdaQueryWrapper<User>();
        lambdaQW.lt(null!=userQuery.getMoney2(),User::getMoney,userQuery.getMoney2());
        lambdaQW.gt(null!=userQuery.getMoney(),User::getMoney,userQuery.getMoney());
        List<User> users = userDao.selectList(lambdaQW);
        return users;
    }

    @Override
    public User getById(Integer id) {
        User user = userDao.selectById(id);
        return user;
    }
}