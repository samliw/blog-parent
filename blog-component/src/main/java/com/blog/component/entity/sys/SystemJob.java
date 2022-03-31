package com.blog.component.entity.sys;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "定时任务调度表")
@Data
public class SystemJob extends BasicBlog {

    @ApiModelProperty(value = "任务id")
    private Integer jobId;
    @ApiModelProperty(value = "任务名称")
    private String jobName;
    @ApiModelProperty(value = "任务组名")
    private String jobGroup;
    @ApiModelProperty(value = "任务方法")
    private String methodName;
    @ApiModelProperty(value = "方法参数")
    private String methodParams;
    @ApiModelProperty(value = "cron执行表达式")
    private String cronExpression;
    @ApiModelProperty(value = "计划执行错误策略（1立即执行 2执行一次 3放弃执行）")
    private String misfirePolicy;
    @ApiModelProperty(value = "是否并发执行（0允许 1禁止）")
    private String concurrent;
    @ApiModelProperty(value = "状态（0正常 1停用）")
    private String status;
    @ApiModelProperty(value = "备注")
    private String remark;
}
