package com.envprotection.system.service;

import com.envprotection.system.user.entity.User;

import java.util.List;

public interface UserService {
    List<User> queryList();

    User queryUserById(Long id);

    User queryUserByUserName(String userName);

    Boolean save(User user);

    Boolean update( User user);

    Boolean delete(Long id);

    Boolean batchDelete(List<Long> ids);
}
