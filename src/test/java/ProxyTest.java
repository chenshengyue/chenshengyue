/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */

import com.csy.service.proxy.JDKProxy.JdkProxy;
import com.csy.service.proxy.common.ProxyServiceImpl;
import com.csy.service.proxy.common.SubjectService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/14 16:42 $
 */

public class ProxyTest extends BaseTest {

    @Autowired
    private ProxyServiceImpl proxyService;

    @Autowired
    private JdkProxy jdkProxy;

    @Test
    public void proxyService(){
        proxyService.add();
        proxyService.update();
    }

    @Test
    public void jdkProxy(){
        SubjectService subjectService = (SubjectService) jdkProxy.bind(proxyService);
        subjectService.add();
        subjectService.update();
    }
}
