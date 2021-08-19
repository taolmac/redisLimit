package com.taos.redislimit.constants;

/**
 * stay hungry,stay foolish
 * 做个吃货，做个二货！
 *
 * @description: 限流类型
 * @author: taosheng
 * @date: 2021/8/19 11:28 上午
 */
public enum LimitType {
    /**
     * 自定义key
     */
    CUSTOMER,
    /**
     * 请求者IP
     */
    IP;
}
