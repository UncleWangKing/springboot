package com.envprotection.system.dao;

import com.envprotection.system.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> queryList();

    User queryUserById(Long id);

    User queryUserByUserName(String userName);

    Boolean save(@Param("obj") User user);

    Boolean update(@Param("obj") User user);

    Boolean batchDelete(@Param("list") List<Long> ids);
}