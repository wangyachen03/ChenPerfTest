package com.chen.xia.service.impl;

import com.chen.xia.mapper.UserMapper;
import com.chen.xia.service.UserService;
import com.chen.xia.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserInfoByLoginname(String loginname) {
        return null;
    }

    @Override
    public User getUserInfoById(int id) {

        return  userMapper.getUserInfoById(id);
    }

    @Override
    public int insertUser(User user) {
        userMapper.insertUser(user);
        return user.getId();
    }
}
