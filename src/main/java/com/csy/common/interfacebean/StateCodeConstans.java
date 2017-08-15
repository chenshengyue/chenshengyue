package com.csy.common.interfacebean; /**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/7 15:10 $
 */

public class StateCodeConstans {

    public static int COMMON_ERROR_CODE = -200;

    public static StateCode SUCCESS = new StateCode(0, "成功");

    public static StateCode SYSTEM_ERROR = new StateCode(-100, "系统异常");

    public static StateCode PARAM_ERROR = new StateCode(-101, "参数缺失");

}
