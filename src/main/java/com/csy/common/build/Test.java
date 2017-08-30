/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.common.build;

import com.alibaba.fastjson.JSON;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/18 10:29 $
 */

public class Test {

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        Computer computer = computerBuilder.create().buildCpu("cpu").buildMainboard("mainboard").buildRam("ram").build();
        System.out.println(JSON.toJSONString(computer));
    }
}
