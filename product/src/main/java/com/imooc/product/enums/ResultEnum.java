package com.imooc.product.enums;

import lombok.Getter;

/**
 * @author xiaozefeng
 * @date 2018/4/19 下午11:35
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXISTS(0, "订单不存在"),
    PRODUCT_STOCK_ERROR(1, "库存有误" +
            ""),
    ;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;

    private String msg;
}
