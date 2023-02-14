package com.wy.controller;

import com.wy.domain.User;
import com.wy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getAll(){
        List<User> listAll = userService.getAll();
        return listAll;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id){
        User byId = userService.getById(id);
        return byId;
    }
}
