package com.blog.component.entity.sys;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

@ApiModel(value = "操作日志记录")
@Data
public class SystemOperationLog {

    @ApiModelProperty(value = "日志主键")
    private Integer operId;
    @ApiModelProperty(value = "模块标题")
    private String title;
    @ApiModelProperty(value = "业务类型（0其它 1新增 2修改 3删除）")
    private Integer businessType;
    @ApiModelProperty(value = "方法名称")
    private Integer method;
    @ApiModelProperty(value = "操作类别（0其它 1后台用户 2手机端用户）")
    private String operatorType;
    @ApiModelProperty(value = "操作人员")
    private String operName;
    @ApiModelProperty(value = "部门名称")
    private String deptName;
    @ApiModelProperty(value = "请求URL")
    private String operUrl;
    @ApiModelProperty(value = "主机地址")
    private String operIp;
    @ApiModelProperty(value = "操作地点")
    private String operLocation;
    @ApiModelProperty(value = "请求参数")
    private String operParam;
    @ApiModelProperty(value = "操作状态（0正常 1异常）")
    private Integer status;
    @ApiModelProperty(value = "错误消息")
    private String errorMsg;
    @ApiModelProperty(value = "操作时间")
    private Date operTime;
}
