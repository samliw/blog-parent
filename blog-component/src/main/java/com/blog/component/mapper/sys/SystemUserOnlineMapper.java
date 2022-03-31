package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemUserOnline;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemUserOnlineMapper {
    List<SystemUserOnline> getAll();
}
