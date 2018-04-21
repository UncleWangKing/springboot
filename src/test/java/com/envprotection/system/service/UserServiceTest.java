package com.envprotection.system.service;

import com.envprotection.system.dao.UserDao;
import com.envprotection.system.user.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void stuff(){
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
        double allCost = cost.stream().map(x -> x+x*0.05).reduce((sum,x) -> sum + x).get();
        System.out.println(allCost);
    }

    @Test
    public void queryList(){
        List<User> list = userService.queryList();
        list.stream().filter(user -> user.getId() >= 1L).collect(Collectors.toList()).forEach(System.out::println);
    }

    @Test
    public void queryUserByIdTest(){
        System.out.println(userService.queryUserById(1L));
    }

    @Test
    public void queryUserByUserName() throws Exception {
        System.out.println(userService.queryUserByUserName("lw"));
    }

    @Test
    public void save() throws Exception {
        User user = new User();
        user.setUserName("pang");
        user.setPassWord("666");
        user.setCreateDate(new Date());
        user.setLastLoginDate(new Date());
        System.out.println(userService.save(user));
    }

    @Test
    public void update() throws Exception {
        User user = new User();
        user.setId(2L);
        user.setUserName("dapang");
        user.setPassWord("233");
        user.setCreateDate(new Date());
        user.setLastLoginDate(new Date());
        System.out.println(userService.update(user));
    }

    @Test
    public void delete() throws Exception {
        System.out.println(userService.delete(2L));
    }
}