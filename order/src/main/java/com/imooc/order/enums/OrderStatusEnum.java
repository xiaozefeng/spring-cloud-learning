package com.imooc.order.enums;

import lombok.Getter;

/**
 * @author xiaozefeng
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结订单"),
    CANCEL(2, "取消订单"),
    ;

    private int code;

    private String msg;

    OrderStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
