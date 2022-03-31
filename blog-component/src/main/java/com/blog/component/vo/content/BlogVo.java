package com.blog.component.vo.content;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@ApiModel(value = "添加博客内容请求体")
@Data
public class BlogVo{

    @NotBlank(message = "标题不能为空！")
    @ApiModelProperty(value = "标题")
    private String title;
    @NotBlank(message = "内容不能为空！")
    @ApiModelProperty(value = "内容")
    private String content;
    @NotBlank(message = "关键字不能为空！")
    @ApiModelProperty(value = "关键字")
    private String keyword;
    @NotBlank(message = "描述不能为空！")
    @ApiModelProperty(value = "描述")
    private String description;
    @ApiModelProperty(value = "菜单id")
    private Integer menuId;
    @ApiModelProperty(value = "缩略图id")
    private Integer imgId;
    @ApiModelProperty(value = "发布状态，draft 草稿  normal 正常-未发布  release 发布 ")
    private String releaseStatus;

}
