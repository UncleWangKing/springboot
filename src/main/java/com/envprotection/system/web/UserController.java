package com.envprotection.system.web;

import com.envprotection.system.service.UserService;
import com.envprotection.system.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    private User get(Long id){
        return userService.queryUserById(id);
    }
}
