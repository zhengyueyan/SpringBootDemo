package com.zy.service.imp;

import com.zy.dao.UserRepository;
import com.zy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zy.service.UserService;

/**
 * @Description:
 * @Author: ZYY
 * @Date: 14:30 2018/5/14
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepositoty;

    public User findUserByName(String name){
        User user = null;
        try{
            user = userRepositoty.findByUserName(name);
        }catch (Exception e){}
        return user;
    }

}
