package com.blog.component.entity.sys;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "用户和角色关联表")
@Data
public class SystemUserRole {

    @ApiModelProperty(value = "用户ID")
    private Integer userId;
    @ApiModelProperty(value = "角色ID")
    private Integer roleId;
}
