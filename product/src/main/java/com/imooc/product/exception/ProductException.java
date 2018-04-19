package com.imooc.product.exception;

import com.imooc.product.enums.ResultEnum;

/**
 * 商品异常
 *
 * @author xiaozefeng
 * @date 2018/4/19 下午11:34
 */
public class ProductException extends RuntimeException{


    private Integer code;


    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
