package com.csy.dao.mapper.menu;

import com.csy.model.menu.Menu;
import com.csy.model.menu.MenuConditions;
import java.util.List;

import com.csy.model.menu.MenuTreeRo;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    int countByExample(MenuConditions example);

    int deleteByExample(MenuConditions example);

    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuConditions example);

    Menu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuConditions example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuConditions example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<MenuTreeRo> getTreeList();
}