package com.blog.component.entity.sys;

import com.blog.component.entity.basic.BasicBlog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;

@ApiModel(value = "系统数据字典")
@Data
public class SystemDictData extends BasicBlog {

    @ApiModelProperty(value = "字典id")
    private Integer dictCode;
    @ApiModelProperty(value = "字典排序")
    private Integer dictSort;
    @ApiModelProperty(value = "字典标签")
    private String dictLabel;
    @ApiModelProperty(value = "字典键值")
    private String dictValue;
    @ApiModelProperty(value = "字典类型")
    private String dictType;
    @ApiModelProperty(value = "样式属性（其他样式扩展）")
    private String cssClass;
    @ApiModelProperty(value = "表格回显样式")
    private String listClass;
    @ApiModelProperty(value = "是否默认（Y是 N否）")
    private Boolean isDefault;
    @ApiModelProperty(value = "状态（0正常 1停用）")
    private Boolean status;
    @ApiModelProperty(value = "备注")
    private String remark;
}
