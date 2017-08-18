/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.common.tree;

import com.csy.model.BaseData;
import com.csy.model.BaseTree;
import com.csy.model.menu.Menu;
import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/17 16:55 $
 */

public class TreeUtils {

    public static <T extends BaseTree<T>> List<T> getChildTreeObjects(List<T> list, Integer pId){

        List<T> returnList = new ArrayList<T>();
        for (Iterator<T> iterator = list.iterator(); iterator.hasNext();) {
            T t = iterator.next();
            // 一、根据传入的某个父节点ID,遍历该父节点的所有子节点
            if (pId.equals(t.getpId())) {
                recursionFn(list, t);
                returnList.add(t);
            }
        }
        return returnList;
    }

    /**
     * 递归列表
     * @param list
     * @param t
     */
    private static <T extends BaseTree<T>> void recursionFn(List<T> list, T t) {
        List<T> childList = getChildList(list, t);// 得到子节点列表
        t.setChildren(childList);
        for (T tChild : childList) {
            if (hasChild(list, tChild)) {// 判断是否有子节点
                Iterator<T> it = childList.iterator();
                while (it.hasNext()) {
                    T n = (T) it.next();
                    recursionFn(list, n);
                }
            }
        }
    }

    /**
     * 获得子节点列表
     * @param list
     * @param t
     * @return
     */
    private static <T extends BaseTree<T>> List<T> getChildList(List<T> list, T t) {
        List<T> tlist = new ArrayList<T>();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            T n = it.next();
            if (n.getpId().equals(t.getId())) {
                tlist.add(n);
            }
        }
        return tlist;
    }

    /**
     * 判断是否有子节点
     * @param list
     * @param t
     * @return
     */
    private static <T extends BaseTree<T>> boolean hasChild(List<T> list, T t) {
        return getChildList(list, t).size() > 0 ? true : false;
    }
}
