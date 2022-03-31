package com.blog.component.mapper.content;

import com.blog.component.entity.content.BlogTag;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface BlogTagMapper {
    List<BlogTag> getAll();
}
