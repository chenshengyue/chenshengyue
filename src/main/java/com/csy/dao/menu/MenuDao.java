/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.dao.menu;

import com.csy.model.menu.Menu;
import com.csy.model.menu.MenuTreeRo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/17 16:42 $
 */
@Repository
public interface MenuDao {

    List<Menu> getList();

    List<MenuTreeRo> getTreeList();
}
