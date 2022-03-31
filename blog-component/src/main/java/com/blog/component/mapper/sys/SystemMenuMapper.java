package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemMenu;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemMenuMapper {
    List<SystemMenu> getAll();
}
