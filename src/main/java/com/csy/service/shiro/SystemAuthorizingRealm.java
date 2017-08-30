/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.service.shiro;

import com.csy.model.permission.Permission;
import com.csy.model.user.User;
import com.csy.model.user.UserAuthRo;
import com.csy.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/18 14:08 $
 */
@Service
public class SystemAuthorizingRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * 权限认证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录时输入的用户名
        String username = (String) principalCollection.fromRealm(getName()).iterator().next();
        User user = userService.getByUsername(username);
        if (user == null) {
            return null;
        }
        UserAuthRo userAuthRo = userService.getUserAuthByUserId(user.getId());
        if(userAuthRo != null){
            //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            //用户角色
            info.setRoles(userAuthRo.getRoles());
            //用户权限
            List<Permission> permissionList = userAuthRo.getPermissionList();
            for (Permission permission : permissionList) {
                info.addStringPermission(permission.getName());
            }
            return info;
        }
        return null;
    }

    /**
     * 登录认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        User user = userService.login(token.getUsername(), String.valueOf(token.getPassword()));
        if (user == null) {
            return null;
        }
        return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
    }

}
