package com.zy.service;

import com.zy.entity.User;

/**
 * @Description:
 * @Author: ZYY
 * @Date: 14:11 2018/5/14
 */
public interface UserService {

    public User findUserByName(String name);

}
