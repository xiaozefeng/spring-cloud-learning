package com.imooc.product.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author xiaozefeng
 */
@Getter
public enum ProductStatus {
    UP("在线", 0),
    DOWN("下线", 1),
    ;

    private String msg;

    private Integer code;

    ProductStatus(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }
}
