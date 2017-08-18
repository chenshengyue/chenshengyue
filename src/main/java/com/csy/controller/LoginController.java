/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.controller;

import com.csy.common.interfacebean.InterfaceBean;
import com.csy.common.interfacebean.InterfaceBeanFactory;
import com.csy.common.interfacebean.StateCode;
import com.csy.model.user.User;
import com.csy.service.UserService;
import com.csy.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/8 9:43 $
 */
@RestController
@RequestMapping("/login")
public class LoginController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public InterfaceBean login(@RequestParam(value = "username") String username,
                               @RequestParam(value = "password") String password){

        if (userService.login(username, password)){
            return InterfaceBeanFactory.success();
        }
        return InterfaceBeanFactory.fail("用户名或者密码错误");
    }

}
