/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */

import com.csy.controller.LoginController;
import com.csy.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/15 11:31 $
 */

public class LoginTest extends BaseTest{

    @Autowired
    private LoginController loginController;

    @Test
    public void login(){
        say(loginController.login("493265692", "123456"));
    }
}
