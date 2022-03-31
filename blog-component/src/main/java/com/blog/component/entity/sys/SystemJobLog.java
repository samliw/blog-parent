package com.blog.component.entity.sys;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@ApiModel(value = "定时任务调度日志表")
@Data
public class SystemJobLog {

    @ApiModelProperty(value = "任务日志id")
    private Integer jobLogId;
    @ApiModelProperty(value = "任务名称")
    private String jobName;
    @ApiModelProperty(value = "任务组名")
    private String jobGroup;
    @ApiModelProperty(value = "任务方法")
    private String methodName;
    @ApiModelProperty(value = "方法参数")
    private String methodParams;
    @ApiModelProperty(value = "日志信息")
    private String jobMessage;
    @ApiModelProperty(value = "异常信息")
    private String exceptionInfo;
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    @ApiModelProperty(value = "状态（0正常 1停用）")
    private String status;

}
