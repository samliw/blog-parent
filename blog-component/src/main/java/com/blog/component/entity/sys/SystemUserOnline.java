package com.blog.component.entity.sys;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "在线用户记录")
@Data
public class SystemUserOnline {

    @ApiModelProperty(value = "用户会话id")
    private String sessionId;
    @ApiModelProperty(value = "登录账号")
    private String login_name;
    @ApiModelProperty(value = "登录IP地址")
    private String ipaddr;
    @ApiModelProperty(value = "登录地点")
    private String login_location;
    @ApiModelProperty(value = "浏览器类型")
    private String browser;
    @ApiModelProperty(value = "操作系统")
    private String os;
    @ApiModelProperty(value = "在线状态on_line在线off_line离线")
    private String status;
    @ApiModelProperty(value = "session创建时间")
    private Date start_timestamp;
    @ApiModelProperty(value = "session最后访问时间")
    private Date last_access_time;
    @ApiModelProperty(value = "超时时间，单位为分钟")
    private Integer expire_time;
}
