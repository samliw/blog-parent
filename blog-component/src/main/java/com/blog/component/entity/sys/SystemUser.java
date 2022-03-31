package com.blog.component.entity.sys;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@ApiModel(value = "用户信息表")
@Data
public class SystemUser extends BasicBlog {
    @ApiModelProperty(value = "用户ID")
    private Integer userId;
    @ApiModelProperty(value = "登录账号")
    private String loginName;
    @ApiModelProperty(value = "用户昵称")
    private String userName;
    @ApiModelProperty(value = "用户类型（00系统用户）")
    private String userType;
    @ApiModelProperty(value = "用户邮箱")
    private String email;
    @ApiModelProperty(value = "手机号码")
    private String phonenumber;
    @ApiModelProperty(value = "用户性别（0男 1女 2未知）")
    private String sex;
    @ApiModelProperty(value = "头像路径")
    private String avatar;
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "盐加密")
    private String salt;
    @ApiModelProperty(value = "帐号状态（0正常 1停用）")
    private String status;
    @ApiModelProperty(value = "删除标志（0代表存在 2代表删除）")
    private String delFlag;
    @ApiModelProperty(value = "最后登陆IP")
    private String loginIp;
    @ApiModelProperty(value = "最后登陆时间")
    private Date loginDate;
    @ApiModelProperty(value = "备注")
    private String remark;
}
