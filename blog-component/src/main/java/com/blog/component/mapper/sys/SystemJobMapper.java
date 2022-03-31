package com.blog.component.mapper.sys;

import com.blog.component.entity.sys.SystemJob;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SystemJobMapper {
    List<SystemJob> getAll();
}
