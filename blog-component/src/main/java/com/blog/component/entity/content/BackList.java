package com.blog.component.entity.content;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@ApiModel(value = "黑名单")
@Data
public class BackList extends BasicBlog {

    @Id
    private Integer blacklistId;
    @ApiModelProperty(value = "黑名单的IP地址")
    private String ipAddr;
    @ApiModelProperty(value = "封禁原因")
    private String description;
    @ApiModelProperty(value = "拦截次数")
    private Integer count;
    @ApiModelProperty(value = "最近一次访问的时间")
    private Date astAccessTime;
    @ApiModelProperty(value = "上一次请求的地址")
    private String lastAccessUrl;
}
