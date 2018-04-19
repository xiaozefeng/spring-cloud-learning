package com.imooc.order.enums;

import lombok.Getter;

/**
 * 支付状态
 *
 * @author xiaozefeng
 * @date 2018/4/19 下午9:20
 */
@Getter
public enum  PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private int code;

    private String msg;

    PayStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
