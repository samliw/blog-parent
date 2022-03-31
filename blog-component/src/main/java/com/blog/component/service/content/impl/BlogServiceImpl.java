package com.blog.component.service.content.impl;

import com.blog.common.exception.GlobalException;
import com.blog.component.entity.content.Blog;
import com.blog.component.mapper.content.BlogMapper;
import com.blog.component.service.content.BlogService;
import com.blog.component.vo.content.BlogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public List<Blog> getAll() {
        return blogMapper.getAll();
    }

    @Override
    public void addArticle(BlogVo vo) throws GlobalException {

    }
}
