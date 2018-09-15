package com.example.wht.service;

import com.example.wht.dao.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/9/15-13:19
 * @description
 */
@Service(value = "userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserInfoMapper userDao;//这里可能会报错，但是并不会影响

    @Override
    public List findAllUser() {
        return userDao.findAllUser();

    }
}