package com.blog.common.exception;

import com.blog.common.enums.SystemExceptionEnum;
import com.blog.common.response.ResponseInfo;
import com.blog.common.web.MessageResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Description: 全局统一异常处理。 用于处理所有的自定义异常，以及非法参数验证异常，运行时异常等。
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * Description: 处理所有GlobalException类型的自定义异常。
     *
     * @param request   Http请求信息对象。
     * @param exception 需要处理的异常。
     * @return 封装了异常信息的响应信息。注意：如果没有自定义异常响应数据，就把异常的原始提示信息作为异常的响应数据返回。
     */
    @ExceptionHandler(value = GlobalException.class)
    @ResponseBody
    public ResponseInfo handleGlobalException(HttpServletRequest request, GlobalException exception) {
        // 获取异常信息对象。
        ExceptionInfo eInfo = exception.getExceptionInfo();
        logger.error(eInfo.getDefaultMessage());
        // 如果是非法参数异常，则响应所有非法参数的异常信息。
        if (SystemExceptionEnum.ILLEGAL_PARAM.getCode().equals(eInfo.getCode())) {
            String msg = MessageResolver.getMessage(eInfo.getCode(), eInfo.getDefaultMessage());
            return new ResponseInfo(eInfo.getCode(), msg, request, eInfo.getDefaultRedirectUrl(), eInfo.getData());
        } else {
            // 根据异常代码获取异常的本地化（国际化）提示消息。
            String msg = MessageResolver.getMessage(eInfo.getCode(), eInfo.getDefaultMessage());
            // 如果没有自定义异常响应数据，就把异常的原始提示信息作为异常的响应数据返回。
            if (exception.getExceptionInfo().getData() == null) {
                Map<String, String> omMap = new HashMap<String, String>(20);
                omMap.put("originalMessage", exception.getMessage());
                return new ResponseInfo(eInfo.getCode(), msg, request, eInfo.getDefaultRedirectUrl(), omMap);
            }
            if(eInfo.getData() == null){
                return new ResponseInfo(eInfo.getCode(), msg, request, eInfo.getDefaultRedirectUrl(), eInfo.getData());
            }else {
                return new ResponseInfo(eInfo.getCode(), msg, request, eInfo.getDefaultRedirectUrl());
            }

        }

    }

    @ResponseBody
    @ExceptionHandler(BindException.class)
    public ResponseInfo handleBindException(HttpServletRequest request, BindException e) throws GlobalException {
        e.printStackTrace();
        String code = SystemExceptionEnum.ILLEGAL_PARAM.getCode();
        String defMessage = SystemExceptionEnum.ILLEGAL_PARAM.getDefaultMessage();
        String msg = MessageResolver.getMessage(code, defMessage);
        return new ResponseInfo(code, msg, request, null, e.getMessage());
    }

    /**
     * Description: 处理所有Exception类型的异常（常常用于捕获运行时异常）。
     *
     * @param request   Http请求信息对象。
     * @param exception 需要处理的异常。
     * @return 封装了异常信息的响应信息。注意：其响应数据部分封装了异常的初始提示信息。
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResponseInfo handleException(HttpServletRequest request, Exception exception, HttpServletResponse response) {
        String code = SystemExceptionEnum.INTERNAL_SERVER_ERROR.getCode();
        String defMessage = SystemExceptionEnum.INTERNAL_SERVER_ERROR.getDefaultMessage();
        String msg = MessageResolver.getMessage(code, defMessage);
        return new ResponseInfo(code, msg, request, null, exception.getMessage());
    }
}
