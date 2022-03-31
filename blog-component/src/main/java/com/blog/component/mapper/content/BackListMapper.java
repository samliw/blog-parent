package com.blog.component.mapper.content;

import com.blog.component.entity.content.BackList;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface BackListMapper {
    List<BackList> getAll();
}
