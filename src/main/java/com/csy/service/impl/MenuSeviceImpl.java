/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.service.impl;

import com.csy.common.tree.TreeUtils;
import com.csy.dao.mapper.menu.MenuMapper;
import com.csy.dao.menu.MenuDao;
import com.csy.model.BaseTree;
import com.csy.model.menu.Menu;
import com.csy.model.menu.MenuTreeRo;
import com.csy.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/17 16:39 $
 */
@Service
public class MenuSeviceImpl implements MenuService{

    @Autowired
    private MenuDao menuDaoImpl;

    public Boolean addMenu(Menu menu) {
        return null;
    }

    public List<MenuTreeRo> getMenuTreeList() {
        List<MenuTreeRo> list = menuDaoImpl.getTreeList();
        return TreeUtils.getChildTreeObjects(list, 0);
    }

}
