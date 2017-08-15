/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.common.aop;

import com.alibaba.fastjson.JSON;
import com.csy.common.interfacebean.InterfaceBean;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/8 13:46 $
 */
@Aspect
public class AfterRetuenAop {

    @AfterReturning(pointcut = "execution(* com.csy.controller..*.*(..))", returning = "interfaceBean")
    public void getReturningAdvice(InterfaceBean interfaceBean) {
        try {
            System.out.println(JSON.toJSONString(interfaceBean));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Before("execution(* com.csy.controller..*.*(..))")
    public void doBefore(JoinPoint point){
        System.out.println("@Before：目标方法为" + point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName());
        System.out.println("@Before：参数为：" + Arrays.toString(point.getArgs()));
        System.out.println("@Before：被织入的目标对象为：" + point.getTarget());
    }
}
