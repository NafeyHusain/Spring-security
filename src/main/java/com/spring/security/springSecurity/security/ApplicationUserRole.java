package com.spring.security.springSecurity.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.spring.security.springSecurity.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ,COURSE_WRITE,STUDENT_READ,STUDENT_WRITE)),
    ADMIN_TRAINEE(Sets.newHashSet(COURSE_READ,STUDENT_READ));


    private final Set<ApplicationUserPermission> permissionSet;

    public Set<ApplicationUserPermission> getPermissionSet() {
        return permissionSet;
    }

    ApplicationUserRole(Set<ApplicationUserPermission> permissionSet) {
        this.permissionSet = permissionSet;
    }
}
