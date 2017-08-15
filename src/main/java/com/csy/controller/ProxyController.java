/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.controller;

import com.csy.service.proxy.common.ProxyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/14 16:09 $
 */
@Controller
public class ProxyController {

    @Autowired
    private ProxyServiceImpl proxyService;

}
