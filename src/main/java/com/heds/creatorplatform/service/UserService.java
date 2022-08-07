package com.heds.creatorplatform.service;

import com.heds.creatorplatform.entity.User;
import com.heds.creatorplatform.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User QueryById(int id) {
        return userMapper.QueryById(id);
    }
}
