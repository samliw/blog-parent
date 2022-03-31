package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemRoleMenu;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemRoleMenuMapper {
    List<SystemRoleMenu> getAll();
}
