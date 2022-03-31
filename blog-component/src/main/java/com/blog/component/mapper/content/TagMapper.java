package com.blog.component.mapper.content;

import com.blog.component.entity.content.Tag;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface TagMapper {
    List<Tag> getAll();
}
