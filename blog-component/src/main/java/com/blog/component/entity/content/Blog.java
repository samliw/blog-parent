package com.blog.component.entity.content;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "博客文章")
@Data
public class Blog extends BasicBlog {

    @ApiModelProperty(value = "博客id")
    private Integer blogId;
    @ApiModelProperty(value = "归类id")
    private Integer categoryId;
    @ApiModelProperty(value = "博文标题")
    private String title;
    @ApiModelProperty(value = "博文摘要")
    private String summary;
    @ApiModelProperty(value = "博文状态，1表示已经发表，2表示在草稿箱，3表示在垃圾箱")
    private Integer status;
    @ApiModelProperty(value = "权重")
    private Integer weight;
    @ApiModelProperty(value = "是否推荐，1表示推荐，0表示不推荐")
    private Boolean support;
    @ApiModelProperty(value = "点击次数")
    private Integer click;
    @ApiModelProperty(value = "标图展示地址")
    private String headerImg;
    @ApiModelProperty(value = "博文类型，1表示markdown，2表示富文本")
    private Integer type;
    @ApiModelProperty(value = "博文正文内容")
    private String content;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getSupport() {
        return support;
    }

    public void setSupport(Boolean support) {
        this.support = support;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public String getHeaderImg() {
        return headerImg;
    }

    public void setHeaderImg(String headerImg) {
        this.headerImg = headerImg;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
