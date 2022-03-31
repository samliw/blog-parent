package com.blog.common.utils;

import java.util.Random;

public class UserCodeUtil {
    private static int min = 10000000;
    private static int max = 99999999;

    /**
     * @return
     * @Description: 生成8位随机数
     * @author
     * @date
     */
    public static synchronized int generateCode() {
        Random random = new Random();
        return random.nextInt(max) % (max - min + 1) + min;
    }

}
