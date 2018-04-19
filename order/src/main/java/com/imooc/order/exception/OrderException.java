package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * 订单异常
 *
 * @author xiaozefeng
 * @date 2018/4/19 下午10:08
 */
public class OrderException extends RuntimeException{

    private Integer code;

    public OrderException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
