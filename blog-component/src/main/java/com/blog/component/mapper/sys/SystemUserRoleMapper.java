package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemUserRole;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemUserRoleMapper {
    List<SystemUserRole> getAll();
}
