package com.blog.component.entity.sys;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "角色和菜单关联表")
@Data
public class SystemRoleMenu {

    @ApiModelProperty(value = "角色ID")
    private Integer roleId;
    @ApiModelProperty(value = "菜单ID")
    private Integer menuId;
}
