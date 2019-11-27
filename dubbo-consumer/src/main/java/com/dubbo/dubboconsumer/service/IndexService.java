package com.dubbo.dubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.dubboapi.Service.UserService;
import com.dubbo.dubboapi.entity.User;
import org.springframework.stereotype.Service;

@Service
public class IndexService {
    @Reference
    UserService userService;

    public User getUser(String id){
        User user = userService.getUserById(id);
        return user;
    }
}
