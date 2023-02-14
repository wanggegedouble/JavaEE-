package com.wy;

import com.wy.dao.UserDao;
import com.wy.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot01QuickstartApplicationTests {

    @Autowired
    private UserDao userDao;
    @Autowired
    private String hello;

    @Test
   public void test01(){
        List<User> list = userDao.selectList(null);
        System.out.println(list);
    }

    @Test void test02(){
        System.out.println(hello);
    }

}
