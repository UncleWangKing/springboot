package com.envprotection.system.web;

import com.envprotection.system.util.Response;
import com.envprotection.system.service.UserService;
import com.envprotection.system.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    private Response get(Long id){
        return new Response().success(userService.queryUserById(id));
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    private Response save(@Valid @RequestBody User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new Response().failure(bindingResult.getFieldError().getDefaultMessage());
        }
        boolean isSuccess;
        if(null == user.getId())
            isSuccess = userService.save(user);
        else
            isSuccess = userService.update(user);
        return new Response(isSuccess);
    }
}
