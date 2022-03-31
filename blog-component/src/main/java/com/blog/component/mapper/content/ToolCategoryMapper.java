package com.blog.component.mapper.content;

import com.blog.component.entity.content.ToolCategory;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface ToolCategoryMapper {
    List<ToolCategory> getAll();
}
