package com.blog.common.enums;

import com.blog.common.exception.ExceptionInfo;
/**
 * Description: 系统级异常信息枚举。
 */
public enum SystemExceptionEnum implements ExceptionInfo {

    /**
     * 参数非法时的异常代码、默认提示信息。
     */
    ILLEGAL_PARAM("100", "参数非法时的异常代码!"),

    /**
     * 参数不完整时的异常代码、默认提示信息。
     */
    INCOMPLETE_PARAM("101", "参数不完整!"),

    /**
     * 未知异常代码、默认提示信息。
     */
    UNKNOWN_ERROR("102", "未知异常代码!"),

    /**
     * 生产环境无法操作数据
     */
    CANNOT_CHANGE_DATAS("103", "生产环境无法操作数据!"),

    /**
     * 对象未找到异常代码、默认提示信息。
     */
    DOMAIN_NOT_FOUND_ERROR("105", "对象未找到异常!"),

    /**
     * 成功时的正常代码、默认提示信息。
     */
    SUCCESSFUL("200", "成功!"),

    /**
     * freemarker异常代码、默认提示信息。
     */
    FREEMARKER_ERROR("301", "freemarker异常!"),

    /**
     * 缺少加密参数
     */
    CONTENT_SECURITY_NEED_ERROR("320", "缺少加密参数!"),
    /**
     * 解密错误
     */
    CONTENT_DECRYPT_ERROR("321", "解密错误!"),

    /**
     * 找不到服务时的异常代码、默认提示信息。
     */
    NOT_FOUND("404", "找不到服务!"),

    /**
     * 没有权限、默认提示信息。
     */
    HAS_NOT_PERMISSION("403", "没有权限!"),

    /**
     * 内部服务出错时的异常代码、默认提示信息。
     */
    INTERNAL_SERVER_ERROR("500", "内部服务出错!"),

    /**
     * 用户未登录、默认提示信息。
     */
    ACCOUNT_NOT_LOGIN("501", "用户未登录!"),

    /**
     * 账户被锁定禁用、默认提示信息。
     */
    ACCOUNT_LOCKED("502", "账户被锁定禁用 !"),

    /**
     * 缺少token认证信息、默认提示信息。
     */
    REQUIRED_TOKEN("503", "缺少token认证信息 !"),

    /**
     * 验证码错误、默认提示信息。
     */
    CAPTCHA_ERROR("504", "验证码错误 !"),

    /**
     * token认证错误信息、默认提示信息。
     */
    TOKEN_ERROR("506", " token认证错误信息 !"),


    /**
     * 站点未找到错误信息、默认提示信息。
     */
    SITE_NOT_FOUND_ERROR("507", " 站点未找到错误 !"),
    /**
     * 不允许重复登录，强制被退出。
     */
    DUPLICATE_LOGIN("508", "不允许重复登录，强制被退出。!"),
    /**
     * 站点已关闭，暂时不能访问
     */
    SITE_CLOSE("509", "站点已关闭，暂时不能访问!"),
    /**
     * 会员功能已关闭，暂时不能访问
     */
    MEMBER_CLOSE("510", "会员功能已关闭，暂时不能访问!"),
    /**
     * 防火墙拦截，无法访问
     */
    FIREWALL_INTERCEPTION("511", "防火墙拦截，无法访问"),

    /**
     * 无权访问非当前站点数据，非法操作错误信息、默认提示信息。
     */
    CAN_NOT_OPERATE_SITE_ERROR("601", " 无权访问非当前站点数据，非法操作错误信息 !"),

    /**
     * 站点已关闭错误信息、默认提示信息。
     */
    SITE_CLOSE_ERROR("602", " 站点已关闭错误信息 !"),

    /**
     * 您非站点管理员账户错误信息、默认提示信息。
     */
    USER_NOT_ADMIN_ERROR("603", "您非站点管理员账户错误信息 !"),


    /**
     * 缺少微信token验证参数
     */
    LACK_WECHAT_VALIDTOKEN_PARAMETERS("701", "缺少微信token验证参数"),

    /**
     * 配置开放平台未设置或者请等待10分钟等待微信开放平台推送相关的component_verify_ticket
     */
    WEIXIN_OPEN_APP_ERROR("702", "配置开放平台未设置或者请等待10分钟等待微信开放平台推送相关的component_verify_ticket "),

    /**
     * 微信公众号或小程序未授权
     */
    WEIXIN_APP_UNAUTHORIZED_ERROR("703", "微信公众号或小程序未授权 "),
    /**
     * 程序未授权
     */
    SYSTEM_UNAUTHORIZED_ERROR("802", "程序未授权  "),
    /**
     * 数据已被删除
     */
    SYSTEM_DATA_DELETE_ERROR("810", "数据已被删除 ");

    /**
     * 异常代码。
     */
    private String code;

    /**
     * 异常对应的默认提示信息。
     */
    private String defaultMessage;

    /**
     * 异常对应的原始提示信息。
     */
    private String originalMessage;

    /**
     * 当前请求的URL。
     */
    private String requestUrl;

    /**
     * 需转向（重定向）的URL，默认为空。
     */
    private String defaultRedirectUrl = "";

    /**
     * 异常对应的响应数据。
     */
    private Object data = new Object();

    /**
     * Description: 根据异常的代码、默认提示信息构建一个异常信息对象。
     *
     * @param code           异常的代码。
     * @param defaultMessage 异常的默认提示信息。
     */
    SystemExceptionEnum(String code, String defaultMessage) {
        this.code = code;
        this.defaultMessage = defaultMessage;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDefaultMessage() {
        return defaultMessage;
    }

    @Override
    public String getOriginalMessage() {
        return originalMessage;
    }

    @Override
    public void setOriginalMessage(String originalMessage) {
        this.originalMessage = originalMessage;
    }

    @Override
    public String getRequestUrl() {
        return requestUrl;
    }

    @Override
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    @Override
    public String getDefaultRedirectUrl() {
        return defaultRedirectUrl;
    }

    @Override
    public void setDefaultRedirectUrl(String defaultRedirectUrl) {
        this.defaultRedirectUrl = defaultRedirectUrl;
    }

    @Override
    public Object getData() {
        return data;
    }

    @Override
    public void setData(Object data) {
        this.data = data;
    }

}
