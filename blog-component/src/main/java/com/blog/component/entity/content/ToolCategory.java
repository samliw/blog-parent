package com.blog.component.entity.content;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "工具分类")
@Data
public class ToolCategory extends BasicBlog {

    @ApiModelProperty(value = "分类id")
    @Id
    private Integer tool_category_id;
    @ApiModelProperty(value = "分类标题")
    private String toolCategoryTitle;
    @ApiModelProperty(value = "权重")
    private Integer weight;
    @ApiModelProperty(value = "是否显示，1表示显示，0表示不显示")
    private Boolean display;

}
