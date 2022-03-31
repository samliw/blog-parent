package com.blog.component.entity.content;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "博客标签")
@Data
public class BlogTag {
    @ApiModelProperty(value = "博客id")
    private Integer blogId;
    @ApiModelProperty(value = "标签id")
    private Integer tagId;

}
