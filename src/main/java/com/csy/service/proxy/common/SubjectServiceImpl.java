/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.service.proxy.common;

import org.springframework.stereotype.Service;

/**
 * 委托类
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/14 16:21 $
 */
@Service
public class SubjectServiceImpl implements SubjectService {


    public void add() {
        System.out.println("SubjectServiceImpl.add");
    }

    public void update() {
        System.out.println("SubjectServiceImpl.update");
    }
}
