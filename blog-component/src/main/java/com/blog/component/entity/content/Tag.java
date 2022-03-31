package com.blog.component.entity.content;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "标签")
@Data
public class Tag extends BasicBlog {
    @ApiModelProperty(value = "标签id")
    private Integer tagId;
    @ApiModelProperty(value = "标签内容")
    private String tag_title;
}
