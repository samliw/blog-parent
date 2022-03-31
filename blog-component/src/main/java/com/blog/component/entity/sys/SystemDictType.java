package com.blog.component.entity.sys;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "字典类型表")
@Data
public class SystemDictType extends BasicBlog {

    @ApiModelProperty(value = "字典主键")
    private Integer dictId;
    @ApiModelProperty(value = "字典名称")
    private String dictName;
    @ApiModelProperty(value = "字典类型")
    private String dictType;
    @ApiModelProperty(value = "状态（0正常 1停用）")
    private String status;
    @ApiModelProperty(value = "备注")
    private String remark;


}
