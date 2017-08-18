/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */

import com.csy.service.MenuService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/18 9:59 $
 */

public class MenuTest extends BaseTest{

    @Autowired
    private MenuService menuServiceImpl;

    @Test
    public void getMenuTreeList(){
        say(menuServiceImpl.getMenuTreeList());
    }
}
