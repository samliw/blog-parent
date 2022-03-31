package com.blog.common.exception;

import java.util.Date;

/**
 * 异常信息接口。
 */
public interface ExceptionInfo {

    /**
     * Description: 获取异常代码。
     *
     * @return 异常代码。
     */
    String getCode();

    /**
     * Description: 获取异常对应的默认自定义提示信息。
     *
     * @return 异常对应的默认自定义提示信息。
     */
    String getDefaultMessage();

    /**
     * Description: 获取异常对应的原始提示信息。
     *
     * @return 异常对应的原始提示信息。
     */
    String getOriginalMessage();

    /**
     * Description: 设置异常对应的原始提示信息。
     *
     * @param originalMessage 异常对应的原始提示信息。
     */
    void setOriginalMessage(String originalMessage);

    /**
     * Description: 获取当前请求的URL。
     *
     * @return 当前请求的URL。
     */
    String getRequestUrl();

    /**
     * Description: 设置当前请求的URL。
     *
     * @param requestUrl 当前请求的URL。
     */
    void setRequestUrl(String requestUrl);

    /**
     * Description: 获取默认的转向（重定向）的URL。
     *
     * @return 默认的转向（重定向）的URL。
     */
    String getDefaultRedirectUrl();

    /**
     * Description: 设置默认的转向（重定向）的URL。
     *
     * @param defaultRedirectUrl 默认的转向（重定向）的URL。
     */
    void setDefaultRedirectUrl(String defaultRedirectUrl);

    /**
     * Description: 获取异常对应的时间戳。
     *
     * @return 异常对应的时间戳。
     */
    default Date getTimestamp() {
        return new Date();
    }

    ;

    /**
     * Description: 获取异常对应的响应数据。
     *
     * @return 异常对应的响应数据。
     */
    Object getData();

    /**
     * Description: 设置异常对应的响应数据。
     *
     * @param data 异常对应的响应数据。
     */
    void setData(Object data);

}