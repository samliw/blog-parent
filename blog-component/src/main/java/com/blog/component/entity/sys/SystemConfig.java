package com.blog.component.entity.sys;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "系统配置")
@Data
public class SystemConfig extends BasicBlog {

    @ApiModelProperty(value = "配置id")
    @Id
    private Integer configId;
    @ApiModelProperty(value = "参数名称")
    private Integer configName;
    @ApiModelProperty(value = "参数键名")
    private Integer configKey;
    @ApiModelProperty(value = "参数键值")
    private Integer configValue;
    @ApiModelProperty(value = "系统内置（Y是 N否）")
    private Integer configType;
}
