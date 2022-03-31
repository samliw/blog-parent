package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemOperationLog;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemOperationLogMapper {
    List<SystemOperationLog> getAll();
}
