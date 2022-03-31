package com.blog.component.service.content.impl;

import com.blog.component.mapper.content.BackListMapper;
import com.blog.component.service.content.BackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BackListServiceImpl implements BackListService {

    @Autowired
    private BackListMapper backListMapper;


}
