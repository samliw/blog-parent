package com.blog.component.entity.content;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "访问记录")
@Data
public class BlogVisitLog extends BasicBlog {

    @ApiModelProperty(value = "访问记录id")
    @Id
    private Integer visitId;
    @ApiModelProperty(value = "ip地址")
    private String ipAddr;
    @ApiModelProperty(value = "访问地址")
    private String location;
    @ApiModelProperty(value = "浏览器类型")
    private String browser;
    @ApiModelProperty(value = "操作系统")
    private String os;
    @ApiModelProperty(value = "爬虫")
    private String spider;
    @ApiModelProperty(value = "请求地址")
    private String requestUrl;
    @ApiModelProperty(value = "访问错误的提示信息")
    private String errorMsg;
    @ApiModelProperty(value = "请求的模块")
    private String title;
    @ApiModelProperty(value = "访问状态,1表示正常，0表示不正常")
    private Boolean status;
}
