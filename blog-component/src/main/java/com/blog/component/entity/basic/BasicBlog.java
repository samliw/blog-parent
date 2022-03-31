package com.blog.component.entity.basic;

import lombok.Data;

import java.util.Date;

@Data
public class BasicBlog {
    private String createBy;
    private Date createTime;
    private String updateBy;
    private Date updateTime;
}
