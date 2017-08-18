/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.dao.menu.impl;

import com.csy.dao.mapper.menu.MenuMapper;
import com.csy.dao.menu.MenuDao;
import com.csy.model.menu.Menu;
import com.csy.model.menu.MenuConditions;
import com.csy.model.menu.MenuTreeRo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/17 16:43 $
 */
@Repository
public class MenuDaoImpl implements MenuDao{

    @Autowired
    private MenuMapper menuMapper;

    public List<Menu> getList() {
        MenuConditions conditions = new MenuConditions();
        return menuMapper.selectByExample(conditions);
    }

    public List<MenuTreeRo> getTreeList() {
        return menuMapper.getTreeList();
    }
}
