package com.blog.component.mapper.content;

import com.blog.component.entity.content.BlogVisitLog;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface BlogVisitLogMapper {
    List<BlogVisitLog> getAll();
}
