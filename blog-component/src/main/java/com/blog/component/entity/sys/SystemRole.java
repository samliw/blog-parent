package com.blog.component.entity.sys;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "角色信息表")
@Data
public class SystemRole extends BasicBlog {

    @ApiModelProperty(value = "角色ID")
    private Integer role_id;
    @ApiModelProperty(value = "角色名称")
    private String role_name;
    @ApiModelProperty(value = "角色权限字符串")
    private Integer role_key;
    @ApiModelProperty(value = "显示顺序")
    private Integer role_sort;
    @ApiModelProperty(value = "数据范围（1：全部数据权限 2：自定数据权限）")
    private String data_scope;
    @ApiModelProperty(value = "角色状态（0正常 1停用）")
    private String status;
    @ApiModelProperty(value = "删除标志（0代表存在 2代表删除）")
    private String del_flag;
}
