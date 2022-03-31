package com.blog.component.entity.sys;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "通知公告表")
@Data
public class SystemNotice extends BasicBlog {

    @ApiModelProperty(value = "公告ID")
    private Integer noticeId;
    @ApiModelProperty(value = "公告标题")
    private String noticeTitle;
    @ApiModelProperty(value = "公告状态（0隐藏 1显示）")
    private String display;
}
