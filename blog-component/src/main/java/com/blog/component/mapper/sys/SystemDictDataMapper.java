package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemDictData;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemDictDataMapper {
    List<SystemDictData> getAll();
}
