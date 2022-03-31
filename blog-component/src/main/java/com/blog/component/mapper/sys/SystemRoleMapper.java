package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemRole;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemRoleMapper {
    List<SystemRole> getAll();
}
