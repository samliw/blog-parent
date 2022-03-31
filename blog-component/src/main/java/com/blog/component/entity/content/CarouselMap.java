package com.blog.component.entity.content;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "轮播图设置")
@Data
public class CarouselMap extends BasicBlog {
    @ApiModelProperty(value = "轮播图设置id")
    @Id
    private Integer carouselId;
    @ApiModelProperty(value = "背景图片地址")
    private String imgUrl;
    @ApiModelProperty(value = "标题")
    private String title;
    @ApiModelProperty(value = "副标题")
    private String subTitle;
    @ApiModelProperty(value = "是否显示，1表示显示，0表示不显示")
    private Boolean display;
    @ApiModelProperty(value = "点击的url地址")
    private String url;
    @ApiModelProperty(value = "是否当前窗口打开，0表示否，1表示是")
    private Boolean target;
    @ApiModelProperty(value = "'点击量")
    private Integer click;
}
