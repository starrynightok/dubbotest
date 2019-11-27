package com.dubbo.dubboproducer.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.dubboapi.Service.UserService;
import com.dubbo.dubboapi.entity.User;
import com.dubbo.dubboproducer.mapper.UserMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }
}
