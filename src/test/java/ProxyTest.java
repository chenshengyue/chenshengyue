/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */

import com.alibaba.fastjson.JSONArray;
import com.csy.service.proxy.JDKProxy.JdkProxy;
import com.csy.service.proxy.common.ProxyServiceImpl;
import com.csy.service.proxy.common.SubjectService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/14 16:42 $
 */

public class ProxyTest extends BaseTest {

    @Autowired
    @Qualifier("proxyServiceImpl")
    private SubjectService proxyServiceImpl;

    @Autowired
    @Qualifier("proxyServiceImpl")
    private SubjectService subjectServiceImpl;

    @Autowired
    @Qualifier("proxyServiceImpl")
    private SubjectService proxyServiceImpl2;

    @Test
    public void proxyService(){
        proxyServiceImpl.add("proxyServiceImpl");
        proxyServiceImpl2.add("proxyServiceImpl2");
        subjectServiceImpl.add("subjectServiceImpl");
    }

    /*@Test
    public void jdkProxy(){
        SubjectService subjectService = (SubjectService) jdkProxy.bind(proxyService);
        subjectService.add();
        subjectService.update();
    }*/

    @Test
    public void aVoid(){


    }
}
