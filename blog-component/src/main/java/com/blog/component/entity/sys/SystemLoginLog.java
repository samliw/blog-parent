package com.blog.component.entity.sys;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@ApiModel(value = "系统访问记录")
@Data
public class SystemLoginLog {

    @ApiModelProperty(value = "访问ID")
    private Integer infoId;
    @ApiModelProperty(value = "登录账号")
    private String loginName;
    @ApiModelProperty(value = "登录IP地址")
    private String ipaddr;
    @ApiModelProperty(value = "登录地点")
    private String loginLocation;
    @ApiModelProperty(value = "浏览器类型")
    private String browser;
    @ApiModelProperty(value = "操作系统")
    private String os;
    @ApiModelProperty(value = "登录状态（0成功 1失败）")
    private String status;
    @ApiModelProperty(value = "提示消息")
    private String msg;
    @ApiModelProperty(value = "访问时间")
    private Date loginTime;
}
