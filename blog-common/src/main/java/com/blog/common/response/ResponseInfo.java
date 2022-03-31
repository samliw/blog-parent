package com.blog.common.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.blog.common.enums.SystemExceptionEnum;
import com.blog.common.web.MessageResolver;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 封装了响应信息，用于统一响应结果
 *
 * @author: tom
 * @date: 2018年12月26日 上午10:13:54
 * @Copyright: 江西金磊科技发展有限公司 All rights reserved.Notice
 * 仅限于授权后使用，禁止非授权传阅以及私自用于商业目的。
 */
@ApiModel("返回结果")
@Data
public class ResponseInfo {

    /**
     * 响应代码。
     */
    @ApiModelProperty(value = "响应代码")
    private int code;

    /**
     * 响应提示信息。
     */
    @ApiModelProperty(value = "响应提示信息")
    private String message;

    /**
     * 当前请求的URL。
     */
    @ApiModelProperty(value = "当前请求的URL")
    private String requestUrl;

    /**
     * 需转向（重定向）的URL，默认为空。
     */
    @ApiModelProperty(value = " 需转向（重定向）的URL，默认为空。")
    private String redirectUrl = "";

    /**
     * 响应时间戳。
     */
    @ApiModelProperty(value = "响应时间戳")
    private Date timestamp = new Date();

    /**
     * 响应数据。
     */
    @ApiModelProperty(value = "响应数据")
    private Object data;
    /**
     * 更新的token
     */
    @ApiModelProperty(value = "更新的token")
    private String token;

    /**
     * Description: 根据当前请求的对象，需转向（重定向）的URL和响应数据构建响应信息对象。注意，该构造方法仅响应请求成功的情况。
     *
     * @param request     当前请求的对象。
     * @param redirectUrl 需转向（重定向）的URL。
     * @param data        响应数据。
     */
    public ResponseInfo(HttpServletRequest request, String redirectUrl, Object data) {
        this.code = Integer.parseInt(SystemExceptionEnum.SUCCESSFUL.getCode());
        this.message = MessageResolver.getMessage(SystemExceptionEnum.SUCCESSFUL.getCode(),
                SystemExceptionEnum.SUCCESSFUL.getDefaultMessage());
        this.requestUrl = request.getRequestURI();
        this.redirectUrl = redirectUrl;
        this.data = data;
    }

    /**
     * Description: 根据需转向（重定向）的URL和响应数据构建响应信息对象。注意，该构造方法仅响应请求成功的情况。
     *
     * @param redirectUrl 需转向（重定向）的URL。
     * @param data        响应数据。
     */
    public ResponseInfo(String redirectUrl, Object data) {
        this.code = Integer.parseInt(SystemExceptionEnum.SUCCESSFUL.getCode());
        this.message = MessageResolver.getMessage(SystemExceptionEnum.SUCCESSFUL.getCode(),
                SystemExceptionEnum.SUCCESSFUL.getDefaultMessage());
        this.redirectUrl = redirectUrl;
        this.data = data;
    }

    /**
     * Description: 根据响应数据构建响应信息对象。注意，该构造方法仅响应请求成功且无返回参数的情况。
     */
    public ResponseInfo() {
        this.code = Integer.parseInt(SystemExceptionEnum.SUCCESSFUL.getCode());
        this.message = MessageResolver.getMessage(SystemExceptionEnum.SUCCESSFUL.getCode(),
                SystemExceptionEnum.SUCCESSFUL.getDefaultMessage());
        this.data = new Object();
    }

    /**
     * Description: 根据响应数据构建响应信息对象。注意，该构造方法仅响应请求成功的情况。
     *
     * @param data 响应数据。
     */
    public ResponseInfo(Object data) {
        this.code = Integer.parseInt(SystemExceptionEnum.SUCCESSFUL.getCode());
        this.message = MessageResolver.getMessage(SystemExceptionEnum.SUCCESSFUL.getCode(),
                SystemExceptionEnum.SUCCESSFUL.getDefaultMessage());
        this.data = data;
    }

    /**
     * 构造器
     *
     * @param data  数据对象
     * @param token token值
     */
    public ResponseInfo(Object data, String token) {
        this.code = Integer.parseInt(SystemExceptionEnum.SUCCESSFUL.getCode());
        this.message = MessageResolver.getMessage(SystemExceptionEnum.SUCCESSFUL.getCode(),
                SystemExceptionEnum.SUCCESSFUL.getDefaultMessage());
        this.data = data;
        this.token = token;
    }

    /**
     * Description:
     * 根据响应码、响应提示信息、当前请求对象、需转向（重定向）URL、响应数据构建响应信息对象。注意，该构造方法响应请求成功和失败（出现异常）两种情况。
     *
     * @param code        响应码。
     * @param message     响应提示信息。
     * @param request     当前请求对象。
     * @param redirectUrl 需转向（重定向）URL。
     * @param data        响应数据。
     */
    public ResponseInfo(String code, String message, HttpServletRequest request, String redirectUrl, Object data) {
        this.code = Integer.parseInt(code);
        this.message = MessageResolver.getMessage(code, message);
        this.requestUrl = request.getRequestURI();
        this.redirectUrl = redirectUrl;
        this.data = data;
    }

    /**
     * Description:
     * 根据响应码、响应提示信息、当前请求对象、响应数据构建响应信息对象。注意，该构造方法响应请求成功和失败（出现异常）两种情况。
     *
     * @param code        响应码。
     * @param message     响应提示信息。
     * @param request     当前请求对象。
     * @param data        响应数据。
     */
    public ResponseInfo(String code, String message, HttpServletRequest request, Object data) {
        this.code = Integer.parseInt(code);
        this.message = MessageResolver.getMessage(code, message);
        this.requestUrl = request.getRequestURI();
        this.data = data;
    }

    /**
     * Description:
     * 根据响应码、响应提示信息、需转向（重定向）URL、响应数据构建响应信息对象。注意，该构造方法响应请求成功和失败（出现异常）两种情况。
     *
     * @param code        响应码。
     * @param message     响应提示信息。
     * @param redirectUrl 需转向（重定向）URL。
     * @param data        响应数据。
     */
    public ResponseInfo(String code, String message, String redirectUrl, Object data) {
        this.code = Integer.parseInt(code);
        this.message = MessageResolver.getMessage(code, message);
        this.redirectUrl = redirectUrl;
        this.data = data;
    }

    /**
     * Description: 根据响应码、响应提示信息、响应数据构建响应信息对象。注意，该构造方法响应请求成功和失败（出现异常）两种情况。
     *
     * @param code    响应码。
     * @param message 响应提示信息。
     * @param data    响应数据。
     */
    public ResponseInfo(String code, String message, Object data) {
        this.code = Integer.parseInt(code);
        this.message = MessageResolver.getMessage(code, message);
        this.data = data;
    }

    /**
     * Description: 根据响应码、响应提示信息、响应数据构建响应信息对象。注意，该构造方法响应请求成功和失败（出现异常）两种情况。
     *
     * @param code    响应码。
     * @param message 响应提示信息。
     */
    public ResponseInfo(String code, String message) {
        this.code = Integer.parseInt(code);
        this.message = MessageResolver.getMessage(code, message);
    }



}
