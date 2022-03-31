package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemLoginLog;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemLoginLogMapper {
    List<SystemLoginLog> getAll();
}
