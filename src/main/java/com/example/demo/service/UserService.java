package com.example.demo.service;

import com.example.demo.entity.user.UserDo;

/**
 * @author wjx
 * @Date:2019/1/17
 * @Description:
 */
public interface UserService {
    UserDo findUserByName(String username);
}
