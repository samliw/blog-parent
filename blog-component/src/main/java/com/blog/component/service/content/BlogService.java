package com.blog.component.service.content;

import com.blog.common.exception.GlobalException;
import com.blog.component.entity.content.Blog;
import com.blog.component.vo.content.BlogVo;

import java.util.List;

public interface BlogService {
    List<Blog> getAll();

    /**
     * 添加博客文章
     * @param vo
     * @throws GlobalException
     */
    void addArticle(BlogVo vo) throws GlobalException;
}
