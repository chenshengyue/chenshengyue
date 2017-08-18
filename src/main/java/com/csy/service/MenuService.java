/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.service;

import com.csy.model.menu.Menu;
import com.csy.model.menu.MenuTreeRo;

import java.util.List;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/17 16:37 $
 */

public interface MenuService {

    Boolean addMenu(Menu menu);

    List<MenuTreeRo> getMenuTreeList();

}
