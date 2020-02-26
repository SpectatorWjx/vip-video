package com.example.demo.service.impl;

import com.example.demo.dao.UserJpa;
import com.example.demo.entity.user.UserDo;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author wjx
 * @Date:2019/1/17
 * @Description:
 */
@Repository
public class UserServiceImpl implements UserService {

    @Autowired
    UserJpa jpa;

    @Override
    public UserDo findUserByName(String username) {
        UserDo userDo = jpa.findUserDoByUsername(username);
        return userDo;
    }
}
