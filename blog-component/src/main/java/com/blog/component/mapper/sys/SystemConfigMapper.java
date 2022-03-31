package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemConfig;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemConfigMapper {
    List<SystemConfig> getAll();
}
