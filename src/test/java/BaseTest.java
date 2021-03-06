/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */

import com.alibaba.fastjson.JSON;
import com.csy.service.UserService;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/14 16:41 $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class BaseTest {

    @Test
    public void base(){
        System.out.println("junit");
    }

    public void say(Object o){
        System.out.println(JSON.toJSONString(o));
    }

    public void sayT(T t){
        System.out.println(JSON.toJSONString(t));
    }

}
