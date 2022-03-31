package com.blog.component.entity.sys;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "菜单")
@Data
public class SystemMenu extends BasicBlog {

    @ApiModelProperty(value = "菜单ID")
    @Id
    private Integer menuId;
    @ApiModelProperty(value = "菜单名称")
    private String menuName;
    @ApiModelProperty(value = "父菜单ID")
    private Integer parentId;
    @ApiModelProperty(value = "显示顺序")
    private Integer orderNum;
    @ApiModelProperty(value = "请求地址")
    private String url;
    @ApiModelProperty(value = "菜单类型（M目录 C菜单 F按钮）")
    private String menuType;
    @ApiModelProperty(value = "菜单状态（0显示 1隐藏）")
    private String visible;
    @ApiModelProperty(value = "权限标识")
    private String perms;
    @ApiModelProperty(value = "菜单图标")
    private String icon;
    @ApiModelProperty(value = "备注")
    private String remark;
}
