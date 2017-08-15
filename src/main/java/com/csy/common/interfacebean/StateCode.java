package com.csy.common.interfacebean; /**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/7 15:01 $
 */

public class StateCode {

    private int code;

    private String msg;

    public StateCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 通用错误信息
     * @param msg
     */
    public StateCode(String msg) {
        this.code = StateCodeConstans.COMMON_ERROR_CODE;
        this.msg = msg;
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
}
