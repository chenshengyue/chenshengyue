/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.controller;

import com.alibaba.fastjson.JSON;
import com.csy.common.interfacebean.InterfaceBean;
import com.csy.common.interfacebean.InterfaceBeanFactory;
import com.yaojiafeng.exportgateway.facade.ogw.ExportGatewayFacade;
import com.yaojiafeng.exportgateway.facade.ogw.protocol.EGProtocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/30 14:59 $
 */
@RestController
@RequestMapping("/invoke")
public class InvokeController extends BaseController{

    @Autowired
    private ExportGatewayFacade exportGatewayFacade;

    @RequestMapping("/invoke")
    public InterfaceBean test(){
        EGProtocol egProtocol = new EGProtocol();
        egProtocol.setAppID("20160819113025272298");
        egProtocol.setToken("20160819113026382185");
        egProtocol.setMethod("com.baidu.map.api.geocoder.v2");
        egProtocol.setBody("");
        EGProtocol result = exportGatewayFacade.invoke(egProtocol);
        return InterfaceBeanFactory.success(JSON.toJSONString(result));
    }
}
