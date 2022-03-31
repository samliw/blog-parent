package com.blog.component.entity.content;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "常用工具")
@Data
public class Tool extends BasicBlog {

    @ApiModelProperty(value = "工具id")
    @Id
    private Integer toolId;
    @ApiModelProperty(value = "工具名称")
    private String toolName;
    @ApiModelProperty(value = "工具描述")
    private String description;
    @ApiModelProperty(value = "显示状态，1表示显示，0表示不显示")
    private Boolean display;
    @ApiModelProperty(value = "链接地址")
    private String url;
    @ApiModelProperty(value = "类型")
    private Boolean type;
    @ApiModelProperty(value = "头像地址")
    private String headImg;
    @ApiModelProperty(value = "'权重'")
    private Integer weight;
    @ApiModelProperty(value = "分类id")
    private Integer toolCategoryId;
}
