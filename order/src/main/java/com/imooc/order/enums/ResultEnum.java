package com.imooc.order.enums;

import lombok.Getter;

/**
 * 定义结果枚举
 *
 * @author xiaozefeng
 * @date 2018/4/19 下午10:11
 */
@Getter
public enum ResultEnum {
    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
