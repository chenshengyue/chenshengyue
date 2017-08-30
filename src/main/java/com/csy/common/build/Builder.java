/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.common.build;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/18 10:25 $
 */

public abstract class Builder {

    public abstract ComputerBuilder buildCpu(String cpu);

    public abstract ComputerBuilder buildMainboard(String mainboard);

    public abstract ComputerBuilder buildRam(String ram);

    public abstract ComputerBuilder create();

}
