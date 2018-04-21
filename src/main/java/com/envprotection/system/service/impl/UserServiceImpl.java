package com.envprotection.system.service.impl;

import com.envprotection.system.dao.UserDao;
import com.envprotection.system.service.UserService;
import com.envprotection.system.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryList() {
        return userDao.queryList();
    }

    @Override
    public User queryUserById(Long id) {
        return userDao.queryUserById(id);
    }

    @Override
    public User queryUserByUserName(String userName) {
        return userDao.queryUserByUserName(userName);
    }

    @Override
    public Boolean save(User user) {
        return userDao.save(user);
    }

    @Override
    public Boolean update(User user) {
        return userDao.update(user);
    }

    @Override
    public Boolean delete(Long id) {
        return batchDelete(Arrays.asList(id));
    }

    @Override
    public Boolean batchDelete(List<Long> ids) {
        return userDao.batchDelete(ids);
    }
}
