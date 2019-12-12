package com.jinman.service.impl;

import com.jinman.mapper.UserMapper;
import com.jinman.model.User;
import com.jinman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fengjinman Administrator on 2018/6/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }
}
