package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemDictType;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemDictTypeMapper {
    List<SystemDictType> getAll();
}
