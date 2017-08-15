/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.controller;

import com.csy.common.interfacebean.InterfaceBean;
import com.csy.common.interfacebean.InterfaceBeanFactory;
import com.csy.common.interfacebean.StateCodeConstans;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/8 10:24 $
 */
@Controller
public class BaseController {

    @ExceptionHandler(Exception.class)
    public InterfaceBean handlerException(Exception e){
        System.out.println(e);
        return InterfaceBeanFactory.fail(StateCodeConstans.SYSTEM_ERROR);
    }

}
