package com.csy.common.interfacebean; /**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/7 14:57 $
 */

public class InterfaceBean {

    private int code;

    private String msg;

    private Object data;

    public InterfaceBean(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public InterfaceBean(StateCode stateCode, Object data) {
        this.code = stateCode.getCode();
        this.msg = stateCode.getMsg();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
