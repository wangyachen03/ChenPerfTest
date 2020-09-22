package com.chen.xia.service;

import com.chen.xia.entity.User;

public interface UserService {

    User getUserInfoByLoginname(String username);

    User getUserInfoById(int id);

    int insertUser(User user);
}
