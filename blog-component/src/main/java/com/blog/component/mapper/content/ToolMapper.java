package com.blog.component.mapper.content;

import com.blog.component.entity.content.Tool;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface ToolMapper {
    List<Tool> getAll();
}
