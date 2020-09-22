package com.chen.xia.mapper;

import com.chen.xia.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUserInfoById(int id);

    User getUserInfoByLoginName(String loginname);

    int insertUser(User user);
}