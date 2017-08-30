/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.common.build;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/18 10:24 $
 */
@Data
public class Computer implements Serializable{

    private static final long serialVersionUID = 2223147927017825423L;

    private String mCpu;

    private String mMainboard;

    private String mRam;

    public String getmCpu() {
        return mCpu;
    }

    public void setmCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public String getmMainboard() {
        return mMainboard;
    }

    public void setmMainboard(String mMainboard) {
        this.mMainboard = mMainboard;
    }

    public String getmRam() {
        return mRam;
    }

    public void setmRam(String mRam) {
        this.mRam = mRam;
    }
}
