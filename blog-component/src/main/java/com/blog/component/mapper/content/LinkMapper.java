package com.blog.component.mapper.content;

import com.blog.component.entity.content.Link;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface LinkMapper {
    List<Link> getAll();
}
