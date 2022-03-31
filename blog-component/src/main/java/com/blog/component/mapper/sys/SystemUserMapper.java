package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemUser;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemUserMapper {
    List<SystemUser> getAll();
}
