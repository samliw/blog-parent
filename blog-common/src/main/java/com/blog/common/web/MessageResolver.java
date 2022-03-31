package com.blog.common.web;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Locale;

/**
 * Message Resolver
 *
 */
@Component
public class MessageResolver {
    private static MessageSource ms;

    public static MessageSource getMs() {
        return ms;
    }

    public static void setMs(MessageSource ms) {
        MessageResolver.ms = ms;
    }

    @Resource
    public void setMessageSource(MessageSource messageSource) {
        setMs(messageSource);
    }

    public static MessageSource getMessageSource() {
        return getMs();
    }

    public static Locale getCurrentLocale() {
        return LocaleContextHolder.getLocale();
    }

    public static String getMessage(MessageSourceResolvable resolvable) throws NoSuchMessageException {
        return ms.getMessage(resolvable, getCurrentLocale());
    }

    public static String getMessage(String code, Object[] args) throws NoSuchMessageException {
        return ms.getMessage(code, args, getCurrentLocale());
    }

    public static String getMessage(String code) throws NoSuchMessageException {
        return ms.getMessage(code, null, getCurrentLocale());
    }

    public static String getMessage(String code, Object[] args, String defaultMsg) {
        return ms.getMessage(code, args, defaultMsg, getCurrentLocale());
    }

    public static String getMessage(String code, String defaultMsg) {
        return getMessage(code, null, defaultMsg);
    }
}
