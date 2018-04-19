package com.imooc.order.utils;

import java.util.Random;

/**
 * ID生成器
 *
 * @author xiaozefeng
 * @date 2018/4/19 下午9:57
 */
public class KeyUtil {

    public static synchronized String genUniqueKey() {
        Random random = new Random();
        int number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
