/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.service.proxy.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 代理类
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/14 16:30 $
 */
@Service
public class ProxyServiceImpl implements SubjectService{

    /*@Autowired
    private SubjectService subjectServiceImpl;*/
    @Autowired
    @Qualifier("subjectServiceImpl")
    private SubjectService subjectService;

    @Override
    public void add(String type) {
        subjectService.add("ProxyServiceImpl");
    }

    @Override
    public void update(String type) {
        subjectService.update("ProxyServiceImpl");
    }
}
