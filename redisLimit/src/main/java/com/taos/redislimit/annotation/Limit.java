package com.taos.redislimit.annotation;

import com.taos.redislimit.constants.LimitType;

import java.lang.annotation.*;

/**
 * stay hungry,stay foolish
 * 做个吃货，做个二货！
 *
 * @description: 自定义限流注解
 * @author: taosheng
 * @date: 2021/8/19 11:30 上午
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Limit {
    /**
     * 名字
     */
    String name() default "";

    /**
     * key
     */
    String key() default "";

    /**
     * Key的前缀
     */
    String prefix() default "";

    /**
     * 给定的时间范围 单位(秒)
     */
    int period();

    /**
     * 一定时间内最多访问次数
     */
    int count();

    /**
     * 限流的类型(用户自定义key或者请求ip)
     */
    LimitType limitType() default LimitType.CUSTOMER;
}
