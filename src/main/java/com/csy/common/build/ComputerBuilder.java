/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.common.build;

import sun.awt.image.BufferedImageDevice;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/18 10:26 $
 */

public class ComputerBuilder extends Builder{

    private Computer computer;

    @Override
    public ComputerBuilder buildCpu(String cpu) {
        this.computer.setmCpu(cpu);
        return this;
    }

    @Override
    public ComputerBuilder buildMainboard(String mainboard) {
        this.computer.setmMainboard(mainboard);
        return this;
    }

    @Override
    public ComputerBuilder buildRam(String ram) {
        this.computer.setmRam(ram);
        return this;
    }

    @Override
    public ComputerBuilder create() {
        this.computer = new Computer();
        return this;
    }

    public Computer build(){
        return this.computer;
    }
}
