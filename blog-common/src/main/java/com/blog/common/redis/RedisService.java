package com.blog.common.redis;

import java.util.concurrent.TimeUnit;

public interface RedisService {
    /**
     * 设置键值对 String
     * @param key
     * @param value
     */
    void setString(String key,String value);

    /**
     * 根据key获取值
     * @param key
     * @return
     */
    String getSting(String key);

    /**
     * 设置键值对
     * @param key
     * @param value
     * @param expiresTime 过期时间
     */
    void setStringTimeUt(String key, String value, Long expiresTime,TimeUnit timeUnit);

    /**
     * 加锁
     * @param key
     * @param value 当前时间 + 超时时间
     * @return
     */
    boolean lock(String key, String value);
    /**
     * 解锁
     * @param key
     * @param value
     */
    void unlock(String key, String value);
}
