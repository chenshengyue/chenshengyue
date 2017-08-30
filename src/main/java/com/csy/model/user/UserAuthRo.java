/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.model.user;

import com.csy.model.permission.Permission;
import com.csy.model.role.Role;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/18 14:34 $
 */

public class UserAuthRo extends User{

    private Role role;

    private List<Permission> permissionList;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    public Set<String> getRoles(){
        HashSet<String> roles = new HashSet<String>();
        roles.add(this.role.getName());
        return roles;
    }
}
