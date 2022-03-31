package com.blog.component.mapper.content;

import com.blog.component.entity.content.Category;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface CategoryMapper {
    List<Category> getAll();
}
