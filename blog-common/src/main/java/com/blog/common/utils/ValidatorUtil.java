package com.blog.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorUtil {

    private static final Pattern mobile_pattern = Pattern.compile("[0-9]*");
    /**
     * 正则表达式：验证邮箱
     */
    public static final String REGEX_EMAIL = "^([a-zA-Z0-9]+([._\\\\-])*[a-zA-Z0-9]*)+@([a-zA-Z0-9])+(.([a-zA-Z])+)+$";

    /**
     * 校验手机号
     *
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isMobile(String src) {
        if (StringUtils.isEmpty(src)) {
            return false;
        }
        Matcher m = mobile_pattern.matcher(src);
        return m.matches();
    }

    /**
     * 校验邮箱
     *
     * @param email
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isEmail(String email) {
        if (StringUtils.isEmpty(email)) {
            return false;
        }
        return Pattern.matches(REGEX_EMAIL, email);
    }

}
