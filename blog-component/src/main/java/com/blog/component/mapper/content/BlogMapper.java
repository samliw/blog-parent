package com.blog.component.mapper.content;

import com.blog.component.entity.content.Blog;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface BlogMapper {
    List<Blog> getAll();
}
