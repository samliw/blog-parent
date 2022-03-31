package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemJobLog;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemJobLogMapper {
    List<SystemJobLog> getAll();
}
