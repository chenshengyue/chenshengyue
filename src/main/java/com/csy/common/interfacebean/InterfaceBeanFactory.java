package com.csy.common.interfacebean; /**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/7 14:59 $
 */

public class InterfaceBeanFactory {

    public static InterfaceBean success(Object data){
        return new InterfaceBean(StateCodeConstans.SUCCESS, data);
    }

    public static InterfaceBean success(){
        return new InterfaceBean(StateCodeConstans.SUCCESS, null);
    }

    public static InterfaceBean fail(StateCode stateCode){
        return new InterfaceBean(stateCode, null);
    }

    public static InterfaceBean fail(String msg){
        return new InterfaceBean(new StateCode(msg), null);
    }

    public static InterfaceBean fail(StateCode stateCode, Object data){
        return new InterfaceBean(stateCode, data);
    }

}
