package com.blog.common.redis.impl;

import com.blog.common.redis.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * RedisTemplate 对五种数据结构分别定义了操作
 *
 * redisTemplate.opsForValue();
 *
 * 操作字符串
 *
 * redisTemplate.opsForHash();
 *
 * 操作hash
 *
 * redisTemplate.opsForList();
 *
 * 操作list
 *
 * redisTemplate.opsForSet();
 *
 * 操作set
 *
 * redisTemplate.opsForZSet();
 *
 */
@Service
@Slf4j
public class RedisServiceImpl implements RedisService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void setString(String key, String value) {
        stringRedisTemplate.opsForValue().set(key,value);
    }

    @Override
    public String getSting(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    @Override
    public void setStringTimeUt(String key, String value, Long expiresTime,TimeUnit timeUnit) {
        stringRedisTemplate.opsForValue().set(key,value, expiresTime,TimeUnit.HOURS);
    }

    @Override
    public boolean lock(String key, String value) {
        if (stringRedisTemplate.opsForValue().setIfAbsent(key, value)){
            return true;
        }
        //解决死锁，且当多个线程同时来时，只会让一个线程拿到锁
        String currentValue = stringRedisTemplate.opsForValue().get(key);
        //如果过期
        if (!StringUtils.isEmpty(currentValue) &&
                Long.parseLong(currentValue) < System.currentTimeMillis()){
            //获取上一个锁的时间
            String oldValue = stringRedisTemplate.opsForValue().getAndSet(key, value);
            if (StringUtils.isEmpty(oldValue) && oldValue.equals(currentValue)){
                return true;
            }
        }

        return false;
    }

    @Override
    public void unlock(String key, String value) {
        try {
            String currentValue = stringRedisTemplate.opsForValue().get(key);
            if (!StringUtils.isEmpty(currentValue) && currentValue.equals(value)){
                redisTemplate.opsForValue().getOperations().delete(key);
            }
        }catch (Exception e){
            log.error("【redis锁】解锁失败, {}", e);
        }
    }
}
