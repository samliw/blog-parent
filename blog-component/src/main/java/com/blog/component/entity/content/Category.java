package com.blog.component.entity.content;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "分类管理")
@Data
public class Category extends BasicBlog {

    @ApiModelProperty(value = "分类id")
    @Id
    private Integer categoryId;
    @ApiModelProperty(value = "分类id")
    private String categoryTitle;
    @ApiModelProperty(value = "权重")
    private Integer weight;
    @ApiModelProperty(value = "描述")
    private String description;
    @ApiModelProperty(value = "是否推荐，1表示推荐，0表示不推荐")
    private Boolean support;
}
