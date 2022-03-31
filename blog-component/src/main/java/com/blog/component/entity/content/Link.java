package com.blog.component.entity.content;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "友情连接")
@Data
public class Link extends BasicBlog {

    @ApiModelProperty(value = "友情连接id")
    @Id
    private Integer linkId;
    @ApiModelProperty(value = "友链的名称")
    private String title;
    @ApiModelProperty(value = "友链描述")
    private String description;
    @ApiModelProperty(value = "友链图标地址")
    private String headerImg;
    @ApiModelProperty(value = "友链点击数")
    private Integer click;
    @ApiModelProperty(value = "友链权重")
    private Integer weight;
    @ApiModelProperty(value = "友链是否能访问，1表示能，0表示不能")
    private Boolean available;
    @ApiModelProperty(value = "友链是否已经处理，1表示已经处理，0表示没有处理")
    private Boolean processed;
    @ApiModelProperty(value = "友链是否显示，1表示显示，0表示不显示")
    private Boolean display;
    @ApiModelProperty(value = "友链的地址")
    private String url;
    @ApiModelProperty(value = "联系邮箱")
    private String email;
}
